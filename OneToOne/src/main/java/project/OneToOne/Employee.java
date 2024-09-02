package project.OneToOne;

import java.util.*;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	int empId;
	String name;
	
	@ManyToMany(mappedBy="emp",cascade=CascadeType.ALL)
	List<Project> project;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	
}
