package com.Nvr.Frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController 
{

	@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false) String error,@RequestParam(value="logout",required=false) String logout ,Model m)
	{
		if(error!=null)
			m.addAttribute("error", "wrong password");
		
		if(logout!=null)
			m.addAttribute("logout", "logout success");
		return "login";
	}
	
	
	@RequestMapping("/")
	public String getpage()
	{
		return"index";
	}
	
	
}
