package day2;

import java.util.Scanner;

class HillStation{
	public void location() {
		System.out.println("Himalayas");
	}
	public void famousfor() {
		System.out.println("cold weather");
	}
}
 class Manali extends HillStation{
		public void location() {
			System.out.println("Manali");
		}
		public void famousfor() {
			System.out.println("mountains");
		}
	}
 class Mussoorie extends HillStation{
		public void location() {
			System.out.println("Mussoorie");
		}
		public void famousfor() {
			System.out.println("winter sports");
		}
	}
 class Gulmarg extends HillStation{
		public void location() {
			System.out.println("Gulmarg");
		}
		public void famousfor() {
			System.out.println("skiing");
		}
	}

public class question7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("hill station: 1-Manali,2-Mussoorie,3-Gulmarg");
		int choice =sc.nextInt();
		HillStation hill;
		switch(choice) {
		case 1:
			hill=new Manali();
			break;
		case 2:
			hill=new Mussoorie();
			break;
		case 3:
			hill=new Gulmarg();
			break;
			
		default:
			System.out.println("invalid");
			return;
			
		}
		
		hill.location();
		hill.famousfor();
		sc.close();
	}
}
