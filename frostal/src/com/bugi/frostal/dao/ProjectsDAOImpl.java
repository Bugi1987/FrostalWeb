package com.bugi.frostal.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bugi.frostal.entity.Project;

@Transactional
@Repository
public class ProjectsDAOImpl implements ProjectsDAO {

	
	//need to inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Project> getProjects() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query ... sort by company name+
		Query<Project> theQuery = 
				currentSession.createQuery("from Project order by company_name", Project.class);
		
		// execute query and get result list
		List<Project> projects = theQuery.getResultList();
		
		// return the results
		return projects;
	}

	@Override
	public void saveProject(Project project) {
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// o tutaj - final point 
		// <-----------
		currentSession.saveOrUpdate(project);
	}

	@Override
	public Project getProjects(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		
		// retrieve/read from database using priomary key
		Project theProjects = currentSession.get(Project.class, theId);
		return theProjects;
	}

	@Override
	public void deleteProject(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query theQuery = currentSession.createQuery("delete from Project where id=:id");
		
		theQuery.setParameter("id", theId);
		
		theQuery.executeUpdate();
	}

	@Override
	public List<Project> searchProjects(String theSearchName) {
		
		// get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        
        Query theQuery = null;
        
        //
        // only search by name if theSearchName is not empty
        //
        if (theSearchName != null && theSearchName.trim().length() > 0) {

            // search for firstName or lastName ... case insensitive
            theQuery =currentSession.createQuery("from Project where lower(company_name) like :company_name", Project.class);
            theQuery.setParameter("company_name", "%" + theSearchName.toLowerCase() + "%");

        }
        else {
            // theSearchName is empty ... so just get all projecs
            theQuery =currentSession.createQuery("from Project", Project.class);            
        }
        
        // execute query and get result list
        List<Project> theProjects = theQuery.getResultList();
                
        // return the results        
        return theProjects;
        
    }

}
