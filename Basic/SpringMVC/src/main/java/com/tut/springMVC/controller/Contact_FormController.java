package com.tut.springMVC.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tut.springMVC.service.UserService;
import com.tut.springMVCmodal.User;

@Controller
public class Contact_FormController {
	
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Learn Code with Durgesh");
		m.addAttribute("Desc", "home for programmer");
		System.out.println("adding command data to model");
	}
	@RequestMapping(path = "/contact",method=RequestMethod.GET)
	public String showForm(Model m){
//		model.addAttribute("Header","Learn Code with Durgesh");
//		model.addAttribute("Desc", "home for programmer");
		System.out.println("Creating Form");
		return "Contact_Form";
	}
	
/*   old process
 * 
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		System.out.println("User name is "+name);
		System.out.println("User email is "+email);
		return "";
	}
	
*/
	/* @RequestParam annotation
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(@RequestParam("name") String userName,
			@RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword,
			Model model)
	{
		
	    
		System.out.println("User name is "+userName);
		System.out.println("User email is "+userEmail);
		System.out.println("User password is "+userPassword);
		
		//process data
		
		model.addAttribute("name", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password",userPassword);
		
		return "success";
		
	}
	
	*/
	
	
	/*
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(
			@RequestParam(name="name",required = false) String userName,
			@RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword,
			Model model)
	{
		
	    
         User user = new User();
         user.setUserName(userName);
         user.setEmail(userEmail);
         user.setPassword(userPassword);
         
         System.out.println(user);
		
		
		//process data
		
         model.addAttribute("user",user);
		
		return "success";
		
	}
	
	*/
	

	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model m)
	{
//		m.addAttribute("Header","Learn Code with Durgesh");
//		m.addAttribute("Desc", "home for programmer");
		System.out.println("Form Submitted");
        System.out.println(user);
        this.userService.createUser(user);

		return "success";
		
	}
	
	

}
