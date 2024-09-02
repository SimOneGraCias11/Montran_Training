package assignment12.hybernate;

import java.util.*;

import javax.persistence.*;
import javax.persistence.TemporalType;

@Entity
public class Patient {
	
	@Id
	int pid;
	String name;
	@Temporal(TemporalType.DATE)
	Date DOA;
	
	@ManyToOne
	Doctor doctor;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDOA() {
		return DOA;
	}

	public void setDOA(Date dOA) {
		DOA = dOA;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	

}
