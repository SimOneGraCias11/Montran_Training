package session;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoCk
 */
@WebServlet("/DemoCk")
public class DemoCk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out =response.getWriter();
Cookie[] ck =request.getCookies();

for(int i=0;i<ck.length;i++) {
	
	out.println(ck[i].getName() + " , " + ck[i].getValue());
}
	}

}
