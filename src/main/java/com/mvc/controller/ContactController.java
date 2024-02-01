package com.mvc.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	// first way to get data by using this HttpServletRequest
//	@RequestMapping(path="/processform" ,method=RequestMethod.POST)
//	public String handleForm(HttpServletRequest req) {
//		String email=req.getParameter("email");
//		System.out.println("Emai is: "+email);
//		return "";
//	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("username") String username,
			@RequestParam("password") String password,Model model

	) {
		System.out.println(userEmail);
		System.out.println(username);
		System.out.println(password);
		
		model.addAttribute("email",userEmail);
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		
	
		return "success";
	}
}
