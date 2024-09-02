package employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class q3
 */
@WebServlet("/q3")
public class q3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public q3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String name=request.getParameter("username");
String password=request.getParameter("pass");
PrintWriter out =response.getWriter();
if(name.equals("ABC") && password.equals("123")) {
	RequestDispatcher dispatcher =request.getRequestDispatcher("index.html");
	dispatcher.forward(request, response);
}else {
	RequestDispatcher dispatcher =request.getRequestDispatcher("login.html");
	dispatcher.include(request, response);
	out.println("invalid");
}

	
	}

}
