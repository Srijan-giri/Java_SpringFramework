package com.tut.springMVC.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("this is home url");
		model.addAttribute("name","Durgesh Tiwary");
		model.addAttribute("id",1421);
		List<String> friends = new ArrayList<String>();
		friends.add("Vandan");
		friends.add("Roshi");
		friends.add("ABC");
		friends.add("Uttam");
		
		model.addAttribute("f", friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("this is about controller");
		// personal details
		model.addAttribute("name", "Srijan Giri");
		model.addAttribute("stream", "ECE");
		model.addAttribute("SEM", "7th Sem");
		model.addAttribute("job", "NRI Fintech");
		return "about";
	}
	
	@RequestMapping("/srijan")
	public ModelAndView srijan() {
		System.out.println("Welcome Srijan");
		ModelAndView modelAndView = new ModelAndView();
		List<String> hobbies=new ArrayList<String>();
		hobbies.add("Cinema");
		hobbies.add("football");
		modelAndView.addObject("hobbies", hobbies);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		modelAndView.setViewName("srijan");
		return modelAndView;
	}
	
	// help
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		
		// creating model and view object
		
		ModelAndView modelAndview = new ModelAndView();
		
		// setting the data
		modelAndview.addObject("name", "Uttam Kumar");
		modelAndview.addObject("roll_number", 123442);
		LocalDateTime now = LocalDateTime.now();
		modelAndview.addObject("time", now);
		
		// marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(3434);
		list.add(7728);
		list.add(32872);
		list.add(9928292);
		
		modelAndview.addObject("marks", list);
		
		// setting the view name
		modelAndview.setViewName("help");
		
		
		return modelAndview;
		
	}

}
