package project.OneToOne;

import java.util.List;

import javax.persistence.*;

@Entity
public class Project {
@Id
	int proj_id;
String proj_name;

@ManyToMany
List<Employee>emp;

public int getProj_id() {
	return proj_id;
}

public void setProj_id(int proj_id) {
	this.proj_id = proj_id;
}

public String getProj_name() {
	return proj_name;
}

public void setProj_name(String proj_name) {
	this.proj_name = proj_name;
}

public List<Employee> getEmp() {
	return emp;
}

public void setEmp(List<Employee> emp) {
	this.emp = emp;
}

	
}
