package session;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenFormDemo
 */
@WebServlet("/HiddenFormDemo")
public class HiddenFormDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	PrintWriter out =response.getWriter();
	String name=request.getParameter("name");
	double sal=Double.parseDouble(request.getParameter("sal"));

	out.println("<html>");
	out.println("<body>");
	out.println("<form action ='Hidden'>");
	out.println("<input type=hidden name=uname value ="+ name +">");
	out.println("<input type =hidden name =usal value =" +sal +">"  );
	out.println("<input type ='submit' value ='go'>");
	out.println("</body>");
	out.println("</html>");
	}

}
