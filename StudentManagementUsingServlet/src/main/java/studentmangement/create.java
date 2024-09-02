package studentmangement;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class create
 */
@WebServlet("/create")
public class create extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out =response.getWriter();
		String name=request.getParameter("name");
		String course=request.getParameter("course");

		String doj=request.getParameter("doj");
		double Fees=Double.parseDouble(request.getParameter("fees"));
		double Paid=Double.parseDouble(request.getParameter("paid"));
		String Address=request.getParameter("address");
		String Contact=request.getParameter("contact");
		
		try {
			
			Date djoin=new SimpleDateFormat("yyyy-MM-dd").parse(doj);
			Student student=new Student(name,course,djoin,Fees,Paid,Address,Contact);
			DaoStudent.addStudent(student);
			
			out.println("<h1>Inserted Successfully</h1>");
			
			out.println("<a href='home.html'>Menu</a>");
			
		}catch(Exception e) {
			e.printStackTrace();
			response.getWriter().println("error");
			
		}
		

		
		
	}

}
