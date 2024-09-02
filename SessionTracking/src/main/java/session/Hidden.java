package session;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hidden
 */
@WebServlet("/Hidden")
public class Hidden extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hidden() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	PrintWriter out =response.getWriter();

String name=request.getParameter("uname");
double sal=Double.parseDouble(request.getParameter("usal"));

out.println("<h1>Name  " + name + "</h1>");
out.println("<h1>Salary  " + sal + "</h1>");


	
	}

}
