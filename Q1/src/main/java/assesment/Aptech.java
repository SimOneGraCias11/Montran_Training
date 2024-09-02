package assesment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Aptech
 */
//@WebServlet("/Aptech")
public class Aptech extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Aptech() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title>Aptech Learning Institute</title>");
out.println("</head>");
out.println("<body>");
out.println("<p> Institute: " +getServletContext().getInitParameter("Institute") +"</p>");
out.println("<p> Course Name: " +getServletConfig().getInitParameter("courseName") + "</p>");
out.println("</body>");
out.println("</html>");


	}

}
