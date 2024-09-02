package day2;

import java.util.Scanner;

public class question1 {
	String name;
	int units;
	double bill;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("customer name:");
		name = sc.nextLine();

		System.out.println("units :");
		units = sc.nextInt();

	}

	public void calculate() {
		double bills = 0.0;
		if (units <= 100) {
			bills = units * 2.0;
		} else if (units <= 300) {
			bills = 200 + ((units - 100) * 3.00);
		} else {
			bills = 200 + 600 + ((units - 300) * 5.00);
			if (units > 300) {
				bills *= 1.025;
			}
		}
		bill = bills;

	}

	public void print() {
		System.out.println("name of customer:" + name);
		System.out.println("number of units consumed: " + units);
		System.out.println("Bill amount:" + bill);
	}

	public static void main(String[] args) {
		question1 bill = new question1();
		bill.accept();
		bill.calculate();
		bill.print();
	}

}
