package com.bugi.frostal.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bugi.frostal.dao.ProjectsDAO;
import com.bugi.frostal.entity.Project;
import com.bugi.frostal.service.ProjectsService;

@Controller
@RequestMapping("/projects")
public class ProjectsController {
	
	private final static String PROJECT_NAME = "project";
	
	// need to inject our projects service
	@Autowired
	private ProjectsService projectsService;
	
	// proba logouta
	@GetMapping("/logout")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		session.invalidate();
		response.sendRedirect("/frostal/index.jsp");
	}
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get projects from the service
		List<Project> theProjects = projectsService.getProjects();
		
		// add projects to the model
		theModel.addAttribute(PROJECT_NAME, theProjects);
		
		return "list-projects";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Project theProjects = new Project();
		
		theModel.addAttribute(PROJECT_NAME, theProjects);
		return "projects-form";
	}

	
	@PostMapping("/saveProject")
	public String saveProject(@ModelAttribute(PROJECT_NAME) Project theProjects) {
		
		// save the customer using our service
		projectsService.saveProject(theProjects);
		
		return "redirect:/projects/list";
	}
	
	// results trying to solve
	@GetMapping("/showResults")
	public String showResults(@RequestParam("projectId") int theId, Model theModel) {
		
		// get the customer from the service
		Project theProjects = projectsService.getProjects(theId);
		
		
		// set project as a model attribute to pre-populate the form
		theModel.addAttribute(PROJECT_NAME, theProjects);
		
		
		// send over to our form
		return "results-form";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("projectId") int theId, Model theModel) {
		
		// get the customer from the service
		Project theProjects = projectsService.getProjects(theId);
		
		
		// set project as a model attribute to pre-populate the form
		theModel.addAttribute(PROJECT_NAME, theProjects);
		
		
		// send over to our form
		return "projects-form";
	}
	
	@GetMapping("/delete")
	public String deleteProject(@RequestParam("projectId") int theId) {
		
		//delete project
		projectsService.deleteProject(theId);
		
		return "redirect:/projects/list";
		
	}
	
	  @PostMapping("/search")
	    public String searchProjects(@RequestParam("theSearchName") String theSearchName,
	                                    Model theModel) {

	        // search projects from the service
	        List<Project> theProjects = projectsService.searchProjects(theSearchName);
	                
	        // add the customers to the model
	        theModel.addAttribute(PROJECT_NAME, theProjects);

	        return "list-projects";        
	    }
}
