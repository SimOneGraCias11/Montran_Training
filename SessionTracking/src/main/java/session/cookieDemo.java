package session;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookieDemo
 */
@WebServlet("/cookieDemo")
public class cookieDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out =response.getWriter();
String name=request.getParameter("name");
String salary= request.getParameter("sal");

Cookie ck =new Cookie(name,salary);
response.addCookie(ck);
out.println("<h1>Welcome " + name + "</h1>");

out.println("<a href = 'DemoCk'> ALL COOKIES");
	
	}

}
