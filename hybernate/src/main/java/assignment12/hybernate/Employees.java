package assignment12.hybernate;

import javax.persistence.*;

@Entity
@Table(name="Employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int empid;
	String name;
	String department;
	Double salary;
	
	public Employees() {
		
	}
	
	@Override
	public String toString() {
		return "Employees [empid=" + empid + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ "]";
	}

	public Employees(String name, String department, Double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
