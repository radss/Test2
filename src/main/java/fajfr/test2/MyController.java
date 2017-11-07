package fajfr.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.MvcNamespaceHandler;

@Controller
public class MyController {
public String message;

@RequestMapping(value="hello")	
public ModelAndView showTest(){
	String message = "hello boy";
	return new ModelAndView("view", "message", message);
}
	

}
