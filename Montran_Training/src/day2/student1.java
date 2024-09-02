package day2;
import java.util.Scanner;

public class student1 {
	int rollno;
	String name;
	String[] subjects;
	int[] marks;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no:");
		rollno=sc.nextInt();
		System.out.println("enter name:");
		name=sc.nextLine().trim();
		System.out.println("enter no of subjects:");
		int no_sub=sc.nextInt();

subjects=new String[no_sub];
marks=new int[no_sub];

System.out.println(no_sub+"subjects");
for(int i=0;i<no_sub;i++) {
	System.out.println("subject name:"+(i+1));
	subjects[i]=sc.nextLine().trim();
	System.out.println("marks:"+subjects[i]);
	marks[i]=sc.nextInt();
}

	}
	public void result() {
		int total=0;
		for(int mark:marks) {
			total+=mark;
		}
		double percent=(double)total/marks.length*100;
		
		System.out.println("roll no:"+rollno);
		System.out.println("name:"+name);
		System.out.println("total marks:"+total);
		System.out.println("percentage:"+percent);

	}

}
