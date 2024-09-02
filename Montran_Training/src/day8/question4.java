package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class Emp{
	int emp_code;
	String name;
	double salary;
	
	public Emp(int emp_code,String name,double salary) {
		this.emp_code=emp_code;
		this.name=name;
		this.salary=salary;
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
}
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> tm = new ArrayList<Emp>();

		//Map<Integer,Emp> tm=new TreeMap<>();
		tm.add(new Emp(1120,"Lincia",2009392))	;
		tm.add(new Emp(1103,"Simone",421442));
		tm.add(new Emp(1002,"Aaron",1423413));
		tm.add(new Emp(1102,"Aditi",234223));
		
		TreeMap<Integer,Emp>ec=new TreeMap<>();
		for(Emp e:tm) {
			ec.put(e.getEmp_code(), e);
			
		}
		System.out.println("Sort Employee Code");
		for(Emp e:ec.values()) {
			System.out.println(e);
		}
		
		TreeMap<String,Emp>en=new TreeMap<>();
		for(Emp e:tm) {
			en.put(e.getName(), e);
			
		}
		System.out.println("Sort Employee Name");
		for(Emp e:en.values()) {
			System.out.println(e);
		}
		
		TreeMap<Double,Emp>es=new TreeMap<>();
		for(Emp e:tm) {
			es.put(e.getSalary(), e);
			
		}
		System.out.println("Sort Employee salary");
		for(Emp e:es.values()) {
			System.out.println(e);
		}

	}

}
