package day3;

import java.util.Calendar;

class AtmMachine{
	String name="ATM"; 
	
	public void display() {
		System.out.println("name of atm:"+ name);
	}
	static class bank_details{
		int code=123;
		String name="ABC";
		String branch="xyz";
		
    static Calendar cal=Calendar.getInstance();
	public void printDetail() {
		System.out.println("name of bank:"+name);
		System.out.println("branch:"+branch);
		System.out.println("code:"+code);
		System.out.println("date and time:"+cal.getTime());
	}

	
	}
}
public class question2 {

	public static void main(String[] args) {
		AtmMachine a=new AtmMachine();
		a.display();
		
		AtmMachine.bank_details ob = new AtmMachine.bank_details ();
		ob.printDetail();

	}

}
