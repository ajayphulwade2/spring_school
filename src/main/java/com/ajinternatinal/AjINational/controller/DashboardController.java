package com.ajinternatinal.AjINational.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
	
	@RequestMapping("/dashboard")
	public String displayDashBoard( Model model, Authentication auth) {
		
		// to show values in the dashboard page
		model.addAttribute("username", auth.getName());
		System.out.println("username "+ auth.getName());
		model.addAttribute("roles" , auth.getAuthorities().toString());
		System.out.println("roles " + auth.getAuthorities().toString());
		
		return "dashboard.html";
		
	}
	

}
