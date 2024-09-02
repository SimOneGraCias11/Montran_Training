package servletprogram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
//@WebServlet("/Servlet")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Calculator#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("server init");
	} 

	/**
	 * @see Calculator#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroyed");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Servlet Calculator</title></head><body>");
		double n1=Double.parseDouble(request.getParameter("fno"));	
		double n2=Double.parseDouble(request.getParameter("sno"));

		if(n2==0) {
//			RequestDispatcher req=request.getRequestDispatcher("NO.html");
//			req.forward(request, response); //-- the output will be displayed on other page
			response.sendRedirect("https://www.google.com/");
		}else {
			RequestDispatcher req=request.getRequestDispatcher("index.html");
			req.include(request, response); //-- the output will get displayed on the same page
		
		double result=0;
		
		String operator=request.getParameter("operator");
		if(operator.equals("+")) {
			result=n1+n2;
		out.println("<h1>Addition of " +n1 + " & " + n2 + ":" +result);}
		
		if(operator.equals("-")) {
			result=n1-n2;
		out.println("<h1>Subtraction of " + n1 + " & " + n2 + ":" +result);
		}
		if(operator.equals("*")) {
				result=n1*n2;
		out.println("<h1>Multipliation of " +n1 + " & " + n2 + ":" +result);
		}
		if(operator.equals("/")) {
			result=n1/n2;
		out.println("<h1>Subtraction of " +n1 + " & " + n2 + ":" +result);
		}
		//out.println("<h1>Results="+result);
		out.println("</body></html");
				}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
