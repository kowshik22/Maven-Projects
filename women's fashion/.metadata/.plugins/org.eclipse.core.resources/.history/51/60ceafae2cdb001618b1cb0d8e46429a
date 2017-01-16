package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	
	@RequestMapping("/loginPage")
	public String loadLoginPage(){
		System.out.println("Login page run");
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {

		System.out.println("Inside login mapping");
		System.out.println(logout+"    "+error);
		
		if (error != null) {
			model.addAttribute("error", "Invalid userEmail and password");
			return "login";// return to login page
		}
		
		//After successfull logout
		return "redirect:/";
	
	}
}



