package day10;

import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.text.*;

public class StudentManagement {
	
	public static DaoStudent studentDao =new DaoStudent();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Add Records");
			System.out.println("2.Show All Records");
			System.out.println("3.Display Records");
			System.out.println("4.Update Records");
			System.out.println("5.Delete Records");
			System.out.println("6.Exit Records");
			System.out.println("Enter ur choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				addRecords(sc);
				break;
				
			case 2:
				showAll();
				break;
				
			case 3:
				display(sc);
				break;
				
			case 4:
				update(sc);
				break;
				
			case 5:
				delete(sc);
				break;
			case 6:
				System.out.println("Exit");
				break;
				default:
					System.out.println("Invalid");
			}
			
		}while(choice!=6);
		sc.close();
	}

	private static void delete(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("enter student id to delete:");
		int id=sc.nextInt();
		try {
		studentDao.deleteStudent(id);
		System.out.println("deleted record");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void update(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("enter id to update:");
		int id=sc.nextInt()
;
		try{
			Student1 student =studentDao.getStudent(id);
			if(student!=null) {
				System.out.println("enter name:");
				student.setName(sc.next());
				System.out.println("enter course:");
				student.setCourse(sc.next());
				System.out.println("enter date of joining:");
				String Date=sc.next();
				try {
				student.setJoinDate(new SimpleDateFormat("yyyy-mm-dd").parse(Date));
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("enter fees:");
				student.setFees(sc.nextDouble());
				System.out.println("enter paid:");
				student.setPaid(sc.nextDouble());
				student.setDue(student.getFees()-student.getPaid());
				System.out.println("enter address:");
				student.setAddress(sc.next());
				System.out.println("enter contact no:");
				student.setContactNo(sc.next());
				
				studentDao.updateStudent(id,student);
				System.out.println("record updated");
				
				
			}else {
				System.out.println("not updated");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		}

	private static void display(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter student Id:");
		int id=sc.nextInt();
		
		try {
			Student1 student =studentDao.getStudent(id);
			if(student!=null) {
				System.out.println(student);
			}else {
				System.out.println("student not found");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void showAll() {
		// TODO Auto-generated method stub
		try {
			List<Student1>students=studentDao.getStudents();
			for(Student1 student:students) {
				System.out.println(student);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void addRecords(Scanner sc) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter no of records to add:");
		int no=sc.nextInt();
		
		for(int i=0;i<no;i++) {
			Student1 student =new Student1();
			System.out.println("enter name:");
			student.setName(sc.next());
			System.out.println("enter course:");
			student.setCourse(sc.next());
			System.out.println("enter date of joining:");
			String Date=sc.next();
			try {
			student.setJoinDate(new SimpleDateFormat("yyyy-mm-dd").parse(Date));
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("enter fees:");
			student.setFees(sc.nextDouble());
			System.out.println("enter paid:");
			student.setPaid(sc.nextDouble());
			student.setDue(student.getFees()-student.getPaid());
			System.out.println("enter address:");
			student.setAddress(sc.next());
			System.out.println("enter contact no:");
			student.setContactNo(sc.next());
			
			
			try
			{
				studentDao.addStudent(student);
				System.out.println("record added");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	}

