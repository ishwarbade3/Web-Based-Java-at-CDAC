package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Customer;
import com.app.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomer(Model theModel) {
		List<Customer> theCustomer = customerService.getCustomer();
		System.out.println(theCustomer);
		theModel.addAttribute("customer", theCustomer);

		return "list-customer";
	}

	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Customer theCustomer = new Customer();
		System.out.println(theCustomer);
		theModel.addAttribute("customer", theCustomer);

		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId")int theId,Model theModel) {
		
		Customer theCustomer = customerService.getCustomer(theId);
		theModel.addAttribute("customer",theCustomer);
		return "customer-form";
	}
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId")int theId,Model theModel) {
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
		
	}
	

}
