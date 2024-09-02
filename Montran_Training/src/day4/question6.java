package day4;

import java.util.Scanner;

class abnormal extends Exception {
	public abnormal(String msg) {
		super(msg);
	}
}

class Customer{
	String flight_no;
	String customer_name;
	double luggage_weight;
	
	public Customer(String flight_no,String customer_name,double luggage_weight) {
		this.flight_no=flight_no;
		this.customer_name=customer_name;
		this.luggage_weight=luggage_weight;
	}

	public String getFlight_no() {
		return flight_no;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public double getLuggage_weight() {
		return luggage_weight;
	}
	public void show() {
		System.out.println("Flight No:" + flight_no);
		System.out.println("Customer Name: " + customer_name);
		System.out.println("Luggage Weight:" + luggage_weight);
	}
}

public class question6 {
public static void main(String[] args) {
	Customer[] c=new Customer[3];
	
	for(int i=0;i<c.length;i++) {
		c[i] = customerdetails();
	}
	
		for(Customer cu :c) {
			try{
				if(cu.getLuggage_weight() >15 ) {
					System.out.println("customer name" + cu.getCustomer_name());
					throw new abnormal("weight exceeds");
				} else {
					System.out.println("customer name" + cu.getCustomer_name());

					System.out.println("proper");
				}
			}catch(abnormal e){
				System.out.println(e);
			}
		}
	}

	public static Customer  customerdetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter flight no:" );
		String flight_no=sc.nextLine();
		
		System.out.println("enter customer name:" );
		String customer_name=sc.nextLine();
		System.out.println("enter Luggage Weight:" );
		double luggage_weight=sc.nextDouble();
		
		return new Customer(flight_no,customer_name,luggage_weight);
	}
	
}
