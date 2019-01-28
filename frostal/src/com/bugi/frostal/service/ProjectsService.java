package com.bugi.frostal.service;

import java.util.List;

import com.bugi.frostal.entity.Project;

public interface ProjectsService {
	
	public List<Project> getProjects();

	public void saveProject(Project theProjects);

	public Project getProjects(int theId);

	public void deleteProject(int theId);

	public List<Project> searchProjects(String theSearchName);

}
