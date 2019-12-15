package com.amie.pma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectContoller {
	
	@RequestMapping("/new")
	public String displayProjectForm() {
		return "new-project";
	}

}
