package day9;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class question5 {

	private static Connection con;

	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","2311");
			
			System.out.println("Connection establish");
			int choice;
			
			do {
				
				System.out.println("1.Create person");
				System.out.println("2.read person");
				System.out.println("3.update person");
				System.out.println("4.delete person");
				System.out.println("5.exit");
				System.out.println("enter ur choice:");
				
				choice=sc.nextInt();
				switch(choice) {
				
				case 1:create();
				break;
				
				case 2: read();
				break;
				
				case 3:update();
				break;
				
				case 4:delete();
				break;
				
				case 5:
					System.out.println("Exit");
					break;
				default:
					System.out.println("invalid");
				}
			}while(choice!=5); 
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
		
			

	
		private static void delete() {
		// TODO Auto-generated method stub
	try {
		PreparedStatement pstmt =con.prepareStatement("delete from person where id =?");
		System.out.println("enter id to delete:");
		
	int id =sc.nextInt();
	pstmt.setInt(1,id);
	int row=pstmt.executeUpdate();
	if(row>0) {
		System.out.println("deleted");
	}else {
		System.out.println("cant delete");
	}
	}catch(Exception e) {
		e.printStackTrace();
			
			
	}

}


		private static void update() {
		// TODO Auto-generated method stub
			System.out.println("enter id to update:");
			int id=sc.nextInt();
			System.out.println("what else do u want to update name/birthdate/city");
			String field=sc.next();
			
		if(field.equals("name")) {
			try {
				PreparedStatement pstmt =con.prepareStatement("update person set name =?");
				System.out.println("enter name to change:");
				
				String nname=sc.next();
				
pstmt.setString(1, nname);			
pstmt.setInt(2, id);
pstmt.execute();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(field.equals("birthdate")){
			try {
				PreparedStatement pstmt =con.prepareStatement("update person set name =?");
				System.out.println("enter birthdate to change:");
				
				String bdate=sc.next();
				
pstmt.setString(1, bdate);			
pstmt.setInt(2, id);
pstmt.execute();
			
			}catch(Exception e) {
				e.printStackTrace();
		}
	


		}else if(field.equals("City")){
		try {
			PreparedStatement pstmt =con.prepareStatement("update person set name =?");
			System.out.println("enter city to change:");
			
			String ccity=sc.next();
			
pstmt.setString(1, ccity);			
pstmt.setInt(2, id);
pstmt.execute();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
		System.out.println("updated successfully");
		}
		private static void read() {
		// TODO Auto-generated method stub
			try {
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from person");
				System.out.println(" ID\\t " +  " Name\\t " + " Birthdate\\t " + " City ");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+ "\t"  +  rs.getString(2) + "\t"  +  rs.getString(3) + "\t"  +  rs.getString(4));
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}




		private static void create() throws SQLException {
		// TODO Auto-generated method stub
			try {
			PreparedStatement pstmt =con.prepareStatement("Insert into person values(?,?,?,?)");
			System.out.println("enter ID:");
			int ID=sc.nextInt();
			System.out.println("enter name:");
			String name=sc.next();
			System.out.println("enter birthdate:");
			String birthdate =sc.next();
			System.out.println("enter city:");
			String City=sc.next();
			pstmt.setInt(1, ID);
			pstmt.setString(2, name);
			pstmt.setString(3, birthdate);
			pstmt.setString(4, City);
			pstmt.execute();
			
			
		System.out.println("created");
	}catch(Exception e) {
		e.printStackTrace();
	}
}

}