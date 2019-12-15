package com.amie.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amie.pma.dao.ProjectRepository;
import com.amie.pma.entities.Project;

@Controller
@RequestMapping("/project") // Home route URL
public class ProjectContoller {
	
	@Autowired
	// create an instance of the PropjectRepo class
	ProjectRepository projectRepo;
	
	@GetMapping("/new-form")
	// localhost:8080/project/new-form/
	public String displayProjectForm(Model model) {
		
		//create an instance of Project and bind an empty project form to the object
		Project oneProject = new Project();
		//	bind model to HTML view
		model.addAttribute("project", oneProject);
		
		return "new-project";
	}
	
	@PostMapping("/create")
	public String createProjectModel(Project project, Model model) {
		// this handle saving to the data input from the user to the database
		projectRepo.save(project);
		
		// use redirect to prevent duplicate submissions
		// can redirect to any page
		
		// if you make changes to this code the table will drop and will create a new table 
		return "redirect:/project/new-form";
	}

}
