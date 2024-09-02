package day9;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","2311");
			
			System.out.println("Connection establish");
			
			Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	
			ResultSet res=smt.executeQuery("Select * from person");
			boolean choice =true;
			
			Scanner sc=new Scanner(System.in);
			
			while(choice) {
				System.out.println("Menu");
				System.out.println("1.First Record");
				System.out.println("2.Last Record");
				System.out.println("3.Previous Record");
				System.out.println("4.Jump to specific Record");
				System.out.println("5.Exit");
				
				System.out.println("Enter ur option");
				int option=sc.nextInt();
				
				switch(option) {
				case 1:
					if(res.first()){
						display(res);
						
					}else {
						System.out.println("no record");
					}
						
					break;
					
				case 2:
					if(res.last()){
						display(res);
						
					}else {
						System.out.println("no record");
					}
						
					break;
				case 3:
					if(res.previous()){
						display(res);
						
					}else {
						System.out.println("no record");
					}
						
					break;
					
				case 4:
					System.out.println("Enter  the number");
					int i=sc.nextInt();
					if(res.absolute(i)){
					display(res);
					
				}else {
					System.out.println("no record");
				}
					
				break;
				case 5:System.out.println("Exit");
				return;
				
				default:System.out.println("invalid");
				}
				
			}
					
			
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
	
	
private static void display(ResultSet res) throws SQLException {
	int id=res.getInt("ID");
	String name=res.getString("name");
	Date birthdate =res.getDate("birthdate");
	String City=res.getString("city");
	
	System.out.println("id:" + id +"\t " + "name:" +"\t"  + name + "\t" + "Birthdate:" + " \t " + birthdate +  "\t" + "City:" + City);
	
}
}