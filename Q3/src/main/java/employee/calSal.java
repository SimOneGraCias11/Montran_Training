package employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calSal
 */
@WebServlet("/calSal")
public class calSal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calSal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
int empno =Integer.parseInt(request.getParameter("empno"));
String empname=request.getParameter("empname");
double sal=Integer.parseInt(request.getParameter("sal"));
double comm=(sal *0.10);
double hra=(sal * 0.07);
double pf=(sal * 0.03);
double total =sal + comm +hra - pf;

PrintWriter out =response.getWriter();
out.println("Employee name:" +empname);
out.println("Employee no:" +empno);
out.println("Salary:" +sal);
out.println("Comm(10% of salary:" +comm);
out.println("Hra (7 % of salary:" +hra);
out.println("pf (3% of salary:" +pf);
out.println("Total:" +total);



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
