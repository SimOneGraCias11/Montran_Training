package studentmangement;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateId
 */
@WebServlet("/UpdateId")
public class UpdateId extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		
		String Id=request.getParameter("uid");
		int id=Integer.parseInt(Id);
		out.println("id");
		
		String name=request.getParameter("uname");
		String course=request.getParameter("ucourse");

		String doj=request.getParameter("udoj");
		double Fees=Double.parseDouble(request.getParameter("ufees"));
		double Paid=Double.parseDouble(request.getParameter("upaid"));
		String Address=request.getParameter("uaddress");
		String Contact=request.getParameter("ucontact");
		Date djoin=null;
		try {
			
			djoin=new SimpleDateFormat("yyyy-MM-dd").parse(doj);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			response.getWriter().println("error");
			
		}
		Student student=new Student(name,course,djoin,Fees,Paid,Address,Contact);
		DaoStudent.updateStudent(id,student);
		
		out.println("<h1>Update Successfully</h1>");
		
		out.println("<a href='home.html'>Menu</a>");
	response.sendRedirect("home.html");	
	}

}
