package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Customer;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/showForm")
	public String coustomerForm(Model theModel) {
		Customer customer = new Customer();
		theModel.addAttribute("customer",customer);
		
		return "customer-form";
	}
	
	@RequestMapping("/process")
	public String processForm(@Valid @ModelAttribute("customer") Customer cust , BindingResult theBimdingResult){
		
		System.out.println(cust);
		if(theBimdingResult.hasErrors()) {
			return "customer-form";
		}else {
		return  "customer-confirm";
	}
	}

}
