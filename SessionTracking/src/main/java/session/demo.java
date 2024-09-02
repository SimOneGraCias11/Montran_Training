package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo
 */
@WebServlet("/demo")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String name=(String) request.getSession().getAttribute("name");
double salary=(double) request.getSession().getAttribute("sal");


PrintWriter out=response.getWriter();


out.println("salary is :" +salary);
out.println("hra is :" +salary *0.10/100);
out.println("pf is :" +salary *0.03/100);


	
	}

}
