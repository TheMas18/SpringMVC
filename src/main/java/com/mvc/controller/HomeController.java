package com.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
// if we use this on class then url will firwst start with url mentioned here
// http://localhost:8080/LearnSpringMVC/first/help

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

	@RequestMapping(path = "/home", method = RequestMethod.GET)
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
		LocalDateTime date = LocalDateTime.now();
		modelAndView.addObject("date", date);

		// Using JSP Expression Language
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		modelAndView.addObject("marks", list);

		modelAndView.setViewName("help");
		// here we have set view for which we have to send data with which view
		return modelAndView;
	}

}
