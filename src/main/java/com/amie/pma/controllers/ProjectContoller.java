package com.amie.pma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amie.pma.entities.Project;

@Controller
@RequestMapping("/project") // Home route URL
public class ProjectContoller {
	
	@RequestMapping("/new")
	public String displayProjectForm(Model model) {
		
		//create an instance of Project and bind an empty project form to the object
		Project oneProject = new Project();
		//	bind model to HTML view
		model.addAttribute("project", oneProject);
		return "new-project";
	}

}
