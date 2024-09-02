package assignment12.hybernate;

import java.util.List;

import javax.persistence.*;

@Entity
public class Doctor {
	@Id
	int id;
	String name;
	String specialization;
	
	@OneToMany(mappedBy="doctor",cascade=CascadeType.ALL)
	List<Patient> patient;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}
	
	

}
