package studentmangement;

import java.io.*;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showAll
 */
@WebServlet("/showAll")
public class showAll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();

		List<Student> students =DaoStudent.getStudents();	
		
		out.println("<html><body>");
		out.println("<h1> Display All Students<h1>");
		out.println("<table border ='1'>");
		out.println("<tr><th>ID</th><th>Name</th><th>Course</th><th>Join Date</th><th>Fees</th><th>Paid</th><th>Due</th><th>Address</th><th>Contact No</th><th>Edit or Remove</th><tr>");
	for(Student student:students) {
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
		out.println("<td>");
		out.println("<a href ='Update?id=" +student.getId() + "'>Update</a> ||");
		out.println("<a href ='Delete?id=" +student.getId() + "'>Delete</a>");

		out.println("</td>");
		out.println("</tr>");

	}
	out.println("</table>");
	out.println("<a href ='home.html'>Back to home</a>");
	out.println("</body></html>");

	
	}

}
