package day9;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","2311");
			
			System.out.println("Connection establish");
			
			PreparedStatement pstmt =con.prepareStatement("Insert into employee1 values(?,?,?,?)");
			
Random r = new Random();

			for(int i=0;i<50;i++) {
				int empno= i;
				String name="Employee"+i;
				String doj =getRandomDate(r);
				double salary=Math.round(r.nextDouble()*22000)/100;
				
			
			pstmt.setInt(1, empno);
			pstmt.setString(2, name);
			pstmt.setString(3,doj);
			pstmt.setDouble(4, salary);
			pstmt.executeUpdate();
			}
		System.out.println("50 records inserted successfullly");
			

}
	catch(Exception e){
		e.printStackTrace();
	}
		
	}
	private static String getRandomDate(Random r) {
		// TODO Auto-generated method stub
		
		int year=2000+r.nextInt(24);
		int month=1+r.nextInt(12);
		int day=1+r.nextInt(28);
		return year + "--" + String.format("%02d", month) + "--" + String.format("%02d", day) ;
	}
}