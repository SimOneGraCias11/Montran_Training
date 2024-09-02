package day6;

import java.io.*;

import java.util.Scanner;

public class question3 {
	
		public static void main(String[] args) {
			String source="C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day6\\file1.txt";
			String dest="C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day6\\file2.txt";
			
			try (
				FileReader r=new FileReader(source);
				FileWriter w=new FileWriter(dest)){
						
						
				//System.out.println("Write Successful");
				
			int data1;
			while((data1=r.read())!=-1) {
				w.write((char)data1);
				//System.out.print((char)data1);
			}
			
			System.out.println("data copied" +source +"to" +dest);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	}