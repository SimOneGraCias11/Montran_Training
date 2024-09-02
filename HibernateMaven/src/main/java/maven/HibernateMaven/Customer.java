package maven.HibernateMaven;
import java.util.Date;

//import javax.persistence.*;

//@Entity
public class Customer {
//@Id
//@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
String city;
Date Dop;

public Customer() {
	super();
}
public Customer(String name, String city,Date Dop) {
	super();
	this.name = name;
	this.city = city;
	this.Dop=Dop;
}

//@Column(name="C")

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Date getDop() {
	return Dop;
}
public void setDop(Date dop) {
	Dop = dop;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Customer(int id, String name, String city,Date Dop) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.Dop=Dop;
}
public String toString() {
	return getId()+ " " +getName() + " " + getCity()+ " " +getDop();
}
}
