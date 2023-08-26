package springmvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.modal.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Learn Code With Durgesh");
		m.addAttribute("Desc", "Home for Programmer");
		System.out.println("Adding common data to model");
	}

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String showView(Model m) {

		/*
		 * m.addAttribute("Header","Learn Code With Durgesh");
		 * m.addAttribute("Desc","Home for Programmer");
		 */

		System.out.println("Showing Form");

		return "contact";
	}

	/* for request param */

	/*
	 * @RequestMapping(path="/processForm",method=RequestMethod.POST) public String
	 * handleForm(@RequestParam(name="name",required = true,defaultValue = "ABC")
	 * String name,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("password")String password, Model model ) {
	 * System.out.println("Name : "+name); System.out.println("Email : "+email);
	 * System.out.println("Password : "+password);
	 * 
	 * 
	 * model.addAttribute("name",name); model.addAttribute("email",email);
	 * model.addAttribute("password",password);
	 * 
	 * return "success"; }
	 */

	/* for maodal attribute */

	/*
	 * 
	 * @RequestMapping(path="/processForm1",method=RequestMethod.POST) public String
	 * handleForm(@RequestParam(name="name",required = true,defaultValue = "ABC")
	 * String name,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("password")String password, Model model ) {
	 * 
	 * User user = new User(); user.setName(name); user.setEmail(email);
	 * user.setPassword(password);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 * 
	 */

	/*
	 * @RequestMapping(path="/processForm1",method=RequestMethod.POST) public String
	 * handleForm(@ModelAttribute("user") User user,Model model) {
	 * 
	 * model.addAttribute("Header","Learn Code With Durgesh");
	 * model.addAttribute("Desc","Home for Programmer");
	 * 
	 * 
	 * 
	 * System.out.println(user);
	 * 
	 * if(user.getName().isBlank()) { return "redirect:/contact"; } int createUser =
	 * this.userService.createUser(user);
	 * model.addAttribute("msg","User created with id "+createUser); return
	 * "success"; }
	 */
	
	 @RequestMapping(path="/processForm1",method=RequestMethod.POST) public String
	 handleForm(@ModelAttribute("user") User user,Model model) {
	 
	 model.addAttribute("Header","Learn Code With Durgesh");
	 model.addAttribute("Desc","Home for Programmer");

	 System.out.println(user);
	 
	 if(user.getName().isBlank()) { return "redirect:/contact"; }
	 int createUser =
	  this.userService.createUser(user);
	  model.addAttribute("msg","User created with id "+createUser);
	  return "success"; 
	  
	 
	 }

}
