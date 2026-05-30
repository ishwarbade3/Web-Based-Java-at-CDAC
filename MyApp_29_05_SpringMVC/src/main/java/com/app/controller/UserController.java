package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api")
public class UserController {
	@RequestMapping("/showForm")
	public String showpage() {
		return "login-form";
	}
	@RequestMapping(path = "/processForm",method = RequestMethod.POST)
	public String processForm(HttpServletRequest request,Model themodel){
	String user = request.getParameter("user");
	user = user.toUpperCase();
	themodel.addAttribute("user",user);
	return "user-confirmation";
	}

}
