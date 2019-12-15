package com.amie.pma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amie.pma.entities.Project;

@Controller
@RequestMapping("/project") // Home route URL
public class ProjectContoller {
	
	@GetMapping("/new-form")
	public String displayProjectForm(Model model) {
		
		//create an instance of Project and bind an empty project form to the object
		Project oneProject = new Project();
		//	bind model to HTML view
		model.addAttribute("project", oneProject);
		
		return "new-project";
	}
	
	@PostMapping("/save-project")
	public String createProjectModel(Project project, Model model) {
		// this handle saving to the data input from the user to the database
	}

}
