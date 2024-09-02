package assignment12.hybernate;

import java.util.*;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class q1 {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Insert 10 records");
			System.out.println("2.Display all employee having salary > entered by user");
			System.out.println("3.Display all employees having dept-name=entered by user");
			System.out.println("4.Show all Records");
			System.out.println("5.Exit Records");
			System.out.println("Enter ur choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				insertRecords();
				break;
				
			case 2:
				displayEmpBySal();
				break;
				
			case 3:
				displayEmpByDept();
				break;
				
			case 4:
				displayAll();
				break;
				
		
			case 5:
				System.out.println("Exit");
				break;
				default:
					System.out.println("Invalid");
			}
			
		}while(choice!=5);
		sc.close();
	

}

	private static void displayAll() {
		// TODO Auto-generated method stub
		try(Session session =factory.openSession()){
			Query<Employees>query=session.createQuery("from Employees",Employees.class);
		List<Employees> employees=query.list();
		for(Employees employee:employees) {
			System.out.println(employee);
		}
		}
	}

	private static void displayEmpByDept() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter department:");
		String department =sc.next();

		try(Session session =factory.openSession()){
			Criteria criteria =session.createCriteria(Employees.class);
			criteria.add(Restrictions.like("department", department));
			List<Employees> employees=criteria.list();
			for(Employees emp:employees) {
				System.out.println(emp.toString());
			}
		}	
		
	}

	private static void displayEmpBySal() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter salary:");
double salary =sc.nextDouble();

try(Session session =factory.openSession()){
	Criteria criteria =session.createCriteria(Employees.class);
	criteria.add(Restrictions.gt("salary", salary));
	List<Employees> employees=criteria.list();
	for(Employees emp:employees) {
		System.out.println(emp.toString());
	}
}
	}

	private static void insertRecords() {
		// TODO Auto-generated method stub
		try(Session session =factory.openSession()){
			
			Transaction tx=session.beginTransaction();
			for(int i=1;i<=10;i++) {
				Employees emp =new Employees("Employees" + i, "Department" +(i%3), 5000.0 + i*100);
				session.save(emp);
			}
			tx.commit();
			System.out.println("10 records inserted successfully");
		}
		
	}
	
	
}
