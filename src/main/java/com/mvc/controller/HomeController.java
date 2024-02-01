package com.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//	@RequestMapping("/home")
//	public String home() {
//
//		System.out.println("This is home url");
//		return "index";
//	}
//	
//	@RequestMapping("/about")
//	public String about() {
//
//		System.out.println("This is about url");
//		return "about";
//	}

	// sending data from controller to view using model

	@RequestMapping("/home")
	public String home(Model model) {

		System.out.println("This is home url");
		model.addAttribute("name", "Mayuresh Samant");
		List<String> friends = new ArrayList<>();
		friends.add("Manoj");
		friends.add("Pratham");
		friends.add("Neha");

		model.addAttribute("f", friends);
		return "index";
	}

	// sending data from controller to view using model and view

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help url");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Goku");
		LocalDateTime date=LocalDateTime.now();
		modelAndView.addObject("date",date);
		modelAndView.setViewName("help");
		// here we have set view for which we have to send data with which view
		return modelAndView;
	}

}
