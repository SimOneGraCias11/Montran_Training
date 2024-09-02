package voting;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class voter
 */
@WebServlet("/voter")
public class voter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public voter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out =response.getWriter();
	String name =request.getParameter("age");
	
	int age;
	try {
	age=Integer.parseInt(name);
	
	}catch(Exception e) {
		age=-1;
	}
	
	if(age>=18) {
		response.sendRedirect("https://voterportal.eci.gov.in/");
	}else {
		request.setAttribute("message","Not eligible" );
		RequestDispatcher dispatcher =request.getRequestDispatcher("vote.html");
		dispatcher.include(request, response);
		out.println("Not Eligible");
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
