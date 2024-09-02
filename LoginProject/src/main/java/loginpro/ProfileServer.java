package loginpro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServer
 */
@WebServlet("/ProfileServer")
public class ProfileServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		request.getRequestDispatcher("links.html").include(request, response);	
		
		Cookie ck[] =request.getCookies();
		
		if(ck!=null) {
			String name=ck[0].getValue();
			if(!name.equals("")|| name!=null) {
				out.println("<h1>Welcome to Profile</h1>");
				out.println("<h1>Welcome " +name);
			}	
			}else {
				out.println("<h1>Plz login first</h1>");
				
				request.getRequestDispatcher("login.html").include(request, response);

			}
		}
		
	
	}


