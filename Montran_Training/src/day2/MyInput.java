package day2;

import java.util.Scanner;

public class MyInput
{
	static Scanner sc=new Scanner(System.in);
	
	public static int getint() 
	{
		System.out.println("enter a integer:");
		return sc.nextInt() ;
	}

public static float getfloat() {
	System.out.println("enter a floating value:");
	while(!sc.hasNextFloat()) {
	System.out.println("invalid");
	sc.next();
}

return sc.nextFloat() ;
}
public static double getdouble() {
	System.out.println("enter a double:");
	while(!sc.hasNextDouble()) {
	System.out.println("invalid");
	sc.next();
}

return sc.nextDouble() ;
}

public static char getchar() {
	System.out.println("enter a char:");
	String input=sc.next();
	if(input.length()!=1) {
		System.out.println("invalid");
		return getchar();
	
}
return input.charAt(0);
}
public static String getstring() {
	System.out.println("enter a string:");
	return sc.nextLine();
}
public static void main(String[] args) {
	System.out.println("n");
	int s=getint();
	
}
}
/*public class question8 {
	public static void main(String[] args) {
		int num=Myinput.getint();
		float f=Myinput.getfloat();
		double d=Myinput.getdouble();
		char c=Myinput.getchar();
		String s=Myinput.getstring();
		
		System.out.println("integer:"+num);
		System.out.println("float:"+f);
		System.out.println("double:"+d);
		System.out.println("character:"+c);
		System.out.println("string:"+s);

	}
}

*/