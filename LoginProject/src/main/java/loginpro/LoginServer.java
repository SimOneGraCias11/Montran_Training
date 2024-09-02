package loginpro;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;

/**
 * Servlet implementation class LoginServer
 */
@WebServlet("/LoginServer")
public class LoginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
PrintWriter out =response.getWriter();
request.getRequestDispatcher("links.html").include(request, response);
String name=request.getParameter("name");
String password=request.getParameter("pass");

if(password.equals("123")) {
	out.println("logged in");
	out.print("<h1>Welcome" + name);
	
	Cookie ck =new Cookie("name", name);
	
	response.addCookie(ck);
}else {
	out.println("Sorry !!! Wrong crediantials");
	request.getRequestDispatcher("login.html").include(request, response);

}


	}

}
