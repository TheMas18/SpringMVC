package com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	//sending data from controller to view
	
	@RequestMapping("/home")
	public String home(Model model) {

		System.out.println("This is home url");
		model.addAttribute("name","Mayuresh Samant");
		List<String> friends=new ArrayList<>();
		friends.add("Manoj");
		friends.add("Pratham");
		friends.add("Neha");
		
		model.addAttribute("f",friends);
		return "index";
	}

}
