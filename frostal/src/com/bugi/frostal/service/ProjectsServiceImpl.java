package com.bugi.frostal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bugi.frostal.dao.ProjectsDAO;
import com.bugi.frostal.entity.Project;

@Service
public class ProjectsServiceImpl implements ProjectsService {

	//need to inject projects dao
	@Autowired
	private ProjectsDAO projectsDAO;
	
	@Override
	@Transactional
	public List<Project> getProjects() {
		return projectsDAO.getProjects();
	}

	@Override
	public void saveProject(Project project) {
		
		project.setDryMatter_con(calculateDryMatter(project));
		project.setAnnual_production(calculateAnnualProduction(project));
		project.setTemp_diff(calculateTemperatureDifference(project));
		project.setTheo_lin_cons(calculateTheoreticalLinConsumptionPerKgOfProduct(project));
		project.setStartup_cons(calculateStartupConsumptionPerKgOfProduct(project));
		project.setIdling_cons(calculateIdlingConsumptionPerKgOfProduct(project));
		project.setTotal_lin_kg(calculateTotalLinConsumptionPerKgOfProduct(project));
		project.setTotal_lin_year(calculateTotalLinConsumptionPerYear(project));
		
		projectsDAO.saveProject(project);
	}
	
	
	
	private int calculateTemperatureDifference(Project project) {
		return project.getInfeed_temp() - project.getOutfeed_temp();
	}
	
	private int calculateAnnualProduction(Project project) {
		return (project.getProduction_kg_per_h() * project.getProduction_hours_per_day() * project.getProduction_days_per_year()) / 1000; 
	}
	
	private int calculateDryMatter(Project project) {
		return 100 - project.getWater_con() - project.getFat_con();
	}
	
	private double calculateTheoreticalLinConsumptionPerKgOfProduct(Project project) {
		// double waterDec = project.getWater_con() / 100;
		//double waterEnt1 = waterDec * project.getInfeed_temp() * 4.187;
		//double waterEnt2 = waterDec * 335;
		//double waterEnt3 = waterDec * project.getOutfeed_temp() * -1 * 2.1;
		//double fatEnt = (project.getFat_con() / 100) * project.getTemp_diff() * 2.1;
		//double dryEnt = (project.getDryMatter_con() / 100) * project.getTemp_diff() * 1.1;
		//double totEnt = waterEnt1 + waterEnt2 + waterEnt3 + fatEnt + dryEnt;
		
		return ((project.getWater_con() * 0.01 * project.getInfeed_temp() * 4.187) + (project.getWater_con() * 0.01 * 335) + (project.getWater_con() * 0.01 * project.getOutfeed_temp() * -1 * 2.1) + (project.getFat_con() *0.01 * project.getTemp_diff() * 2.1) + (project.getDryMatter_con() *0.01 * project.getTemp_diff() * 1.1)) / 320; 
		
		//return totEnt / 320;
	}
	
	private double calculateStartupConsumptionPerKgOfProduct(Project project) {
		return (81.35 * project.getStartups_per_year()) / (project.getAnnual_production() * 1000);
	}
	
	private double calculateIdlingConsumptionPerKgOfProduct(Project project) {
		return 58.75 / project.getProduction_kg_per_h();
	}
	
	private double calculateTotalLinConsumptionPerKgOfProduct (Project project) {
		return calculateTheoreticalLinConsumptionPerKgOfProduct(project) + calculateStartupConsumptionPerKgOfProduct(project) + calculateIdlingConsumptionPerKgOfProduct(project);
	}
	
	private int calculateTotalLinConsumptionPerYear (Project project) {
		return (int) Math.round(calculateTotalLinConsumptionPerKgOfProduct(project) * project.getAnnual_production() * 1000);
	}
	

	@Override
	@Transactional
	public Project getProjects(int theId) {
		return projectsDAO.getProjects(theId);
	}

	@Override
	@Transactional
	public void deleteProject(int theId) {
		projectsDAO.deleteProject(theId);
	}

	@Override
	@Transactional
	public List<Project> searchProjects(String theSearchName) {
		return projectsDAO.searchProjects(theSearchName);
	}

}
