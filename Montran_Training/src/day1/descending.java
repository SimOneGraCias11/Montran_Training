package day1;

import java.util.Scanner;

public class descending {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int amt;
	
	do{
		System.out.println("enter the amount:");
		amt=sc.nextInt();
	}while(amt<=0 || amt>99999);
	
	int[] deno= {2000,500,200,100,50,20,10,1};
	int total=0;
	
System.out.println("breakdown:");
for(int denom:deno) {
	int note =amt/denom;
	amt%=denom;
	
	if(note>0) {
		System.out.println(denom  +" rupees" + note);
		total+=note;
	}
}
System.out.println("total"+total);
sc.close();
	
}
}
