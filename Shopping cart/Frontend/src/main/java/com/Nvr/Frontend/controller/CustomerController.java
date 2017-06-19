package com.Nvr.Frontend.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Nvr.Backend.daoimp.CustomerDAOImp;
import com.Nvr.Backend.model.Customers;



@Controller
public class CustomerController {
	
	@Autowired
	CustomerDAOImp customerDao;

	@RequestMapping("/registrationform")
	public String getRegistrationform(Model m)
	{
		m.addAttribute("customer", new Customers());
		return "Registration";
	}
	
	@RequestMapping("/register")
	public String registerCustomer(@Valid @ModelAttribute("customer") Customers customer,BindingResult result,Model m)
	{
		/*if(result.hasErrors())
			return "Registration";*/
	
		//System.out.println(customer.getPhone());
		customerDao.savecustomer(customer);
		return "RegistrationSuccess";
		
	}
}
