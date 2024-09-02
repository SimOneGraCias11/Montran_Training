package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Emp1 implements Serializable {
	int emp_code;
	String name;
	double salary;

	public Emp1(int emp_code, String name, double salary) {
		this.emp_code = emp_code;
		this.name = name;
		this.salary = salary;
	}

	public int getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(int emp_code) {
		this.emp_code = emp_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee code: " + emp_code + " Employee name: " + name + " Salary:" + salary;
	}

	public class question5 {

		static final File file = new File("C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day6\\file.txt");

		static List<Emp1> emp = new ArrayList<Emp1>();
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			emp=loadEmployee();
			while (true) {
				System.out.println("1:Add employee details");
				System.out.println("2.Display Employee details");
				System.out.println("3.Update the details of employee");
				System.out.println("4.Delete employee details");
				System.out.println("5.Exit");
				System.out.println("Enter your choice:");
				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					addEmployee();
					saveemp();
					break;

				case 2:
					displayEmployee();
					break;
				case 3:
					updateEmployee();
					saveemp();
					break;
				case 4:
					deleteEmployee();
					saveemp();
					break;
				case 5:
					System.out.println("Exit");
					sc.close();
					return;

				default:
					System.out.println("invalid");

				}

			}
		}

		private static void deleteEmployee() {
			// TODO Auto-generated method stub
			
			System.out.println("Enter employee code to delete:");
			int emp_code=sc.nextInt();

			Iterator <Emp1> itr=emp.iterator();
			while(itr.hasNext()) {
Emp1 employee =itr.next();
if(employee.getEmp_code() ==emp_code) {
	itr.remove();
	System.out.println("Employee removed");
	return;
}
			}
		}

		private static void updateEmployee() {
			// TODO Auto-generated method stub
System.out.println("enter employee no to update:");
int emp_code=sc.nextInt();
for(Emp1 employee:emp) {		
	if(employee.getEmp_code() == emp_code) {
		System.out.println("enter new name:");
		String nname=sc.next()
;
		System.out.println("enter new salary:");
		double nsalary=sc.nextDouble();
		
		employee.setName(nname);
		employee.setSalary(nsalary);
		System.out.println("employee updated successfully");
		return;
		
		
	}
}
		}

		private static void displayEmployee() {
			// TODO Auto-generated method stub
			if(emp.isEmpty()) {
				System.out.println("nothing to display");
			
			}else {
				
			for(Emp1 employee:emp) {
				System.out.println(employee);
			}
				
			}
				
			}

	
	private static void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee number:");
		int emp_code=sc.nextInt();
		System.out.println("Enter Employee name:");
		String name=sc.next();
		System.out.println("Enter Employee salary:");
		double salary=sc.nextDouble();
		
		Emp1 employee =new Emp1(emp_code,name,salary);
		emp.add(employee);
		System.out.println("Employee Successfully added");
		
	}


public static void saveemp() {
	try (
			FileOutputStream f = new FileOutputStream(file);	
			ObjectOutputStream os=new ObjectOutputStream(f)){
			
			os.writeObject(emp);
			System.out.println("person added successfully");
			}catch(Exception e) {
				e.printStackTrace();
			}
}

public static  List<Emp1>loadEmployee(){
	
	File file = new File("C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day6\\file.txt");
if(!file.exists()) {
	return new ArrayList<>();


}
		try (
			FileInputStream fin = new FileInputStream(file);	
			ObjectInputStream oin=new ObjectInputStream(fin)) {
			
			return (ArrayList<Emp1>) oin.readObject();
}catch(Exception e) {
	e.printStackTrace();
	
	return new ArrayList();
}
}

}
}