package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller

public class loginController {


	@RequestMapping("/login")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		
		String uname=request.getParameter("uname");
		
		String pass=request.getParameter("pass");

		ModelAndView mv=new ModelAndView("login");
 
		if(uname.equals("ABC") && pass.equals("123")) {
			
			mv.setViewName("hello");
			mv.addObject("uname",uname);
		}else {
			mv.setViewName("unsuccessful");
			mv.addObject("uname",uname);

			mv.addObject("ERROR","Sorry !! Wrong Username and Password..");
		}
		
		return mv;
		
	
}

}