package day4;

import java.util.Scanner;

class duplicate_no extends Exception {
	public duplicate_no(String msg) {
		super(msg);
	}
}

public class question5 {
	public static void main(String[] args) throws duplicate_no {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.  of integers :");
		int n = sc.nextInt();

		System.out.println("enter list of integers:");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {

			for (int j = 1; j < i; j++) {
				if (arr[i] == arr[j]) {
					throw new duplicate_no("duplicate no");
				}
			}
		}
		System.out.println("right");
	}

}
