package com.mvc.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.model.User;

@Controller
public class ContactController {

	@ModelAttribute
	public void commonMaterial(Model model) {
		model.addAttribute("Header", "Registration Page");
		// we can use model attribute like this also like if we have common files
		// so when handlers will be loaded it will load first so that repetitive code
		// can be avoided
	}

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

	// Using Request param for getting data
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("username") String username,
//			@RequestParam("password") String password,Model model
//
//	) {
//		System.out.println(userEmail);
//		System.out.println(username);
//		System.out.println(password);
//		
//		model.addAttribute("email",userEmail);
//		model.addAttribute("username",username);
//		model.addAttribute("password",password);
//		
//	
//		return "success";
//	}
//	

	// this is also one way
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("username") String username,
//			@RequestParam("password") String password, Model model
//
//	) {
//
//		User user = new User();
//		user.setEmail(userEmail);
//		user.setUsername(username);
//		user.setPassword(password);
//		System.out.println(user);
//
//		model.addAttribute("user", user);
//
//		return "success";
//	}

	// Using ModelAttribute

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user) {

		return "success";
	}
}
