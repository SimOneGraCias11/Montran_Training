package day4;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {

		int a, b;
		String d = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		a = sc.nextInt();
		System.out.println("enter the value of b");
		b = sc.nextInt();
		try {
			//Arithmetic exception
			int c = a / b;
			System.out.println("Arithmetic exception:" + c);
			
			//nullpointer exception
			d.length();
			
			//NumberFormat Exception
			int f=Integer.parseInt("2");

			//Arrayindexoutofbond
			int[] array=new int[5];
			int g=array[10];
			
		} catch (ArithmeticException e) {

			System.out.println("Cant divide by zero" + e);
			// e.printStackTrace();

		}catch (IndexOutOfBoundsException e) {

			System.out.println("IndexOutOfBoundsException" + e);
			// e.printStackTrace();

		}catch (NullPointerException e) {

			System.out.println("NullPointerException" + e);
			// e.printStackTrace();

		}catch (NumberFormatException e) {

			System.out.println("NumberFormatException" + e);
			// e.printStackTrace();

		}
		

		finally {
			System.out.println("Always execute");

		}
	}
}
