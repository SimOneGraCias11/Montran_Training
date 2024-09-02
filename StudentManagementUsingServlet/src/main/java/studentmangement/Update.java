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
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out =response.getWriter();
out.println("<html><body>");
out.println("<form action ='Update' >");
out.println("Enter Id:  <input type='text' name='id'/>");
out.println("<button>Submit</button> ");
out.println("</form>");
out.println("<a href ='home.html'>Back to home</a>");
out.println("</body></html>");

int id=Integer.parseInt(request.getParameter("id"));

Student available =DaoStudent.getStudent(id);
out.println("<html><body>");
if(available !=null) {
	out.println("<form action='UpdateId'>");
	out.println("<input type='hidden' name='uid' value='" + available.getId() + "'/>");
	out.println("Name: <input type='text' name='uname' value='" + available.getName() + "'/><br/>");
	out.println("Course: <input type='text' name='ucourse' value='" + available.getCourse() + "'/><br/>");
	out.println("Join Date: <input type='text' name='udoj' value='" + available.getJoinDate() + "'/><br/>");
	out.println("Fees:<input type='text' name='ufees' value='" + available.getFees() + "'/><br/>");
	out.println("Paid:<input type='text' name='upaid' value='" + available.getPaid() + "'/><br/>");
	out.println("<input type='hidden' name='udue' value='" + available.getDue() + "'/>");
	out.println("Address:<input type='text' name='uaddress' value='" + available.getAddress() + "'/><br/>");
	out.println("Contact No:<input type='text' name='ucontact' value='" + available.getContactNo() + "'/><br/>");
out.println("<input type='submit' value ='Update'/>");
out.println("</form>");
}else {
	out.println("No Student found with Id:" +id);
}
out.println("<a href ='home.html'>Back to home</a>");
out.println("</body></html>");

	




	}


}