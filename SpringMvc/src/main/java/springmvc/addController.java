package springmvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.*;

@Controller
public class addController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int n1=Integer.parseInt(request.getParameter("n1"));
		int n2=Integer.parseInt(request.getParameter("n2"));
		
		int result=n1+n2;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Result");
	 mv.addObject("result",result);
	 return mv;
 
	}
	
}
