package day4;
//unchecked exception
import java.util.Scanner;


class practice1{
	public static void main(String[] args) {
		
	int a,b;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of a");
	a=sc.nextInt();
	System.out.println("enter the value of b");

	b=sc.nextInt();
	try {
	int c=a/b;
	
	System.out.println("C:" +c);
	
	}
	catch(Exception e) {
		
		System.out.println("Arithmetic exception:"+e);
		//e.printStackTrace();
		
	}
	finally {
		System.out.println("Always execute");
		
	}
}
}
