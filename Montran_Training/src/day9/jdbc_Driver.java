package day9;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","2311");
			
			System.out.println("Connection establish");
			
			//STATEMENT
			
			//Statement smt=con.createStatement();
			
			//int a = smt.executeUpdate("insert into emo values(13,'Lincia','2024-08-13',24566)");
			//System.out.println(a+"no of rows affected");
			
			//int b=smt.executeUpdate("update emo set salary=12345 where emp_id=12");
			//System.out.println(b+"affected rows");
			
			//int c=smt.executeUpdate("delete from emo where emp_id=123");
			//System.out.println(c+"affected row");
			
			
			//PREPARED STATEMENT
			
			Date d=new Date(24,03,21);
			PreparedStatement pstmt =con.prepareStatement("Insert into emo values(?,?,?,?)");
			pstmt.setInt(1, 34);
			pstmt.setString(2, "Simone");
			pstmt.setDate(3,d);
			
			pstmt.setDouble(4, 23444);
			int i=pstmt.executeUpdate();
			
			System.out.println(i+"rows updated");
		//	ResultSet res=smt.executeQuery("Select * from emo");
//			System.out.println("emp_id\t "  +  " empname\t " +  " date\t " +  "  salary\t " );
//			
//			
//			System.out.println("-----------------------------------------");
//			while(res.next()) {
//				System.out.println(res.getInt(1)+ "\t"  +  res.getString(2) + "\t"  +  res.getDate(3) + "\t"  +  res.getDouble(4));
//			
//			}
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
