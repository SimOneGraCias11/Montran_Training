package montran.mavenpro;

import java.util.Date;

public class Student {
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", joinDate=" + joinDate + ", fees="
				+ fees + ", paid=" + paid + ", due=" + due + ", address=" + address + ", contactNo=" + contactNo + "]";
	}

	int id;
	String name;
	String course;
	Date joinDate;
	double fees;
	double paid;
	double due;
	String address;
	String contactNo;
	
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public double getDue() {
		return due;
	}

	public void setDue(double due) {
		this.due = due;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String course, Date joinDate, double fees, double paid, double due,
			String address, String contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.joinDate = joinDate;
		this.fees = fees;
		this.paid = paid;
		this.due = due;
		this.address = address;
		this.contactNo = contactNo;
	}
}
