package com.amie.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amie.pma.dao.EmployeeRepository;
import com.amie.pma.entities.Employee;

@Controller
@RequestMapping("/employee") // Home route URL
public class EmployeeController {
	@Autowired
	// create an instance of the PropjectRepo class
	EmployeeRepository employeeRepo;
	
	// URL to go to the form
	@GetMapping("/new-employee-form")
	public String displayEmployeeForm(Model model) {
		Employee oneEmployee = new Employee();
		model.addAttribute("employee", oneEmployee);
		// returns the new-employee.html file
		return "new-employee";
	}
	
	// URL to create form and route back
	@PostMapping("/create")
	public String createEmployeeModel(Employee employee, Model model) {
		employeeRepo.save(employee)
		;
		
		return "redirect:/employee/new-employee-form";
	}
}
