package studentmangement;

import java.io.IOException;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		out.println("<html><body>");
		out.println("<form action ='Delete' >");
		out.println("Enter Id:  <input type='text' name='id'/>");
		out.println("<button>Submit</button> ");
		out.println("</form>");
		out.println("<a href ='home.html'>Back to home</a>");
		out.println("</body></html>");
		
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		try {
			DaoStudent.deleteStudent(id);
			response.sendRedirect("showAll");
			
		}catch(Exception e) {
			e.printStackTrace();
			out.println("Error:" + e.getMessage());
		}
	}

}
