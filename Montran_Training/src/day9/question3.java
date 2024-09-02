package day9;

import java.sql.*;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","2311");
			
			System.out.println("Connection establish");
			Statement smt=con.createStatement();
			ResultSet res=smt.executeQuery("Select * from person");
			ResultSetMetaData md=res.getMetaData();
			for(int i=1;i<=md.getColumnCount();i++) {
				System.out.println(" Column Name: " + md.getColumnName(i) + " Column Type:  " + md.getColumnTypeName(i));
			}

	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}
