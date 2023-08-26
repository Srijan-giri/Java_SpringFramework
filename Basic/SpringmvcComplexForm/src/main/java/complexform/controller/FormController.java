package complexform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import complexform.Modal.Student;

@Controller
public class FormController {

	@RequestMapping(path = "/show", method = RequestMethod.GET)
	public String showView(Model m) {

		System.out.println("Showing Form");

		return "complex_form";
	}

	@RequestMapping(path = "/processForm1", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("student") Student student, BindingResult result) {

		if (result.hasErrors()) {
			return "complex_form";
		}
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";

	}
	/*
	 * 
	 * @RequestMapping(path = "/processForm1", method = RequestMethod.POST) public
	 * String handleForm(@ModelAttribute("student") Student student, Model model) {
	 * 
	 * System.out.println(student);
	 * 
	 * int r = this.studentService.createUser(student); System.out.println(r);
	 * return "success";
	 * 
	 * }
	 * 
	 */

}
