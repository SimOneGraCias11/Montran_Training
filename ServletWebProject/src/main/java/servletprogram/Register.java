package servletprogram;

import java.io.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
//@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String id=request.getParameter("username");
		String password=request.getParameter("pass");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		Connection con =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","2311");
			
			System.out.println("Connection establish");
			
			PreparedStatement pstmt =con.prepareStatement("Insert into user values(?,?,?,?)");
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			pstmt.setString(3,email);
			pstmt.setString(4,country);

			int row=pstmt.executeUpdate();
			out.println("<h1> " + row + " Inserted");
		}catch(Exception e) {
			out.println(e);
		}

	
}


}
