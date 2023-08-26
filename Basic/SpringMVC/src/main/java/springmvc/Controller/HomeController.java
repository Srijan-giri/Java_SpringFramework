package springmvc.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*4. Create a controller class*/

@Controller
//@RequestMapping("/first")-----> /first/home or /help or /about
public class HomeController {

	/* relative URLs */
	@RequestMapping(path = "/home",method = RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("This is home url.....");
		
		model.addAttribute("name","Srijan Giri");
		model.addAttribute("id",1421);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Aman");
		friends.add("Asim");
		friends.add("Mukul");
		friends.add("Uttam");
		
		model.addAttribute("f",friends);
		return "hello";  // return index.jsp
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";
	}
	
	/* handler method */
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller ");
		
		// creating ModelAndView
		ModelAndView modelAndview = new ModelAndView();
		// Setting the data
		modelAndview.addObject("name","Uttam Kumar");
		modelAndview.addObject("rollnumber", 124241);
		LocalDateTime now = LocalDateTime.now();
		modelAndview.addObject("time",now);
		
		// marks
		List<Integer> marks =  new ArrayList<Integer>();
		marks.add(100);
		marks.add(3434);
		marks.add(2345);
		marks.add(7281);
		marks.add(9063);
		
		modelAndview.addObject("marks",marks);
		// Setting the view
		modelAndview.setViewName("help");
		return modelAndview;
	}
//	public String hello()
	
	// Services 
	// help
	
}
