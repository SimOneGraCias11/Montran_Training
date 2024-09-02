package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
	
	@RequestMapping("/home")
	public String display() {
		
		return "index";
	}
	@RequestMapping("/hello")
	public String welcome() {
		
		return "hello";
	}
}
