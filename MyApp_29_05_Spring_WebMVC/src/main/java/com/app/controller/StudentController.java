package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student student =new Student();
		
		theModel.addAttribute("student",student);
		return "student-form";
		
	}
	@RequestMapping(path = "/processForm" , method = RequestMethod.POST)
	@PostMapping("processForm")
	
	public String processForm (@ModelAttribute ("student") Student std) {
	System.out.println(std);
	return "student-confirmation";
	}
	

}
