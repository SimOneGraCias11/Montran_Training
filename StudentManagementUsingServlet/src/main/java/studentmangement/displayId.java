package studentmangement;

import java.io.IOException;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class displayId
 */
@WebServlet("/displayId")
public class displayId extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<form action ='displayId' >");
		out.println("Enter Id:  <input type='text' name='id'/>");
		out.println("<button>Submit</button> ");
		out.println("</form>");
		out.println("<a href ='home.html'>Back to home</a>");
		out.println("</body></html>");


		int id=Integer.parseInt(request.getParameter("id"));

		Student student = DaoStudent.getStudent(id);
		if (student != null) {
			out.println("<html><body>");
			out.println("<h1> Display Student By Id<h1>");
			out.println("<table border ='1'>");
			out.println(
					"<tr><th>ID</th><th>Name</th><th>Course</th><th>Join Date</th><th>Fees</th><th>Paid</th><th>Due</th><th>Address</th><th>Contact No</th><tr>");
			out.println("<tr>");
			out.println("<td>" + student.getId() + "</td>");
			out.println("<td>" + student.getName() + "</td>");
			out.println("<td>" + student.getCourse() + "</td>");
			out.println("<td>" + student.getJoinDate() + "</td>");
			out.println("<td>" + student.getFees() + "</td>");
			out.println("<td>" + student.getPaid() + "</td>");
			out.println("<td>" + student.getDue() + "</td>");
			out.println("<td>" + student.getAddress() + "</td>");
			out.println("<td>" + student.getContactNo() + "</td>");
			out.println("</tr>");

			out.println("</table>");
			out.println("<a href ='home.html'>Back to home</a>");
			out.println("</body></html>");
		}else {
			out.println("No Student found with Id:" +id);
		}
	}



		
	}
	