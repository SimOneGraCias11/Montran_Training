package assignment12.hybernate;


import javax.persistence.*;

@Entity
public class Passport {
	@Id
	int passid;
	int valid;
	String city;
	@OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
	Person person;

	public int getPassid() {
		return passid;
	}

	public void setPassid(int passid) {
		this.passid = passid;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}