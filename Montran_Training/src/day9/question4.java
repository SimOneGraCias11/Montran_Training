package day9;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class question4 {

	private static Connection con;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","2311");
			
			System.out.println("Connection establish");
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the table name:");
			String tname=sc.next();		
			
			System.out.println("Enter no fields:");
			int field=sc.nextInt();
			
			String[] fields=new String[field];
			String [] datatype=new String[field];
			
			boolean[] isPrimaryKey =new boolean[field];
			
			for(int i=0;i<field;i++) {
				System.out.println("enter field name:");
				fields[i]=sc.next();
				
				System.out.println("enter datatype name:");
				datatype[i]=sc.next();
				
				System.out.println("do u want it to be primary key(y/n):");
				isPrimaryKey[i] =sc.next().equalsIgnoreCase("y");
				
			}
			createTable(tname,fields,datatype,isPrimaryKey);
			
				
	}catch(Exception e) {
		e.printStackTrace();
	}

}
	private static void createTable(String tname, String[] fields, String[] datatype, boolean[] isPrimaryKey) {
		// TODO Auto-generated method stub
		StringBuilder str= new StringBuilder("create table " + tname  + "(");
		
		for(int i=0;i <fields.length;i++) {
			str.append(fields[i]).append(" ").append(datatype[i]);
			if(isPrimaryKey[i]) {
				str.append(" primary key");
			}
			if(i < fields.length - 1) {
				str.append(", ");
			}
			
		}
		str.append(");");
	
		
		try {
			Statement st = con.createStatement();
			st.execute(str.toString());
			System.out.println("table" + tname +"created");
			
		}catch(Exception e) {
			e.printStackTrace();
		};
	}
	
		
	}
