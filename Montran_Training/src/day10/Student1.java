package day10;

import java.sql.Date;

import java.util.*;
public class Student1 {

	int id;
	String name;
	String course;
	java.util.Date joinDate;
	double fees;
	double paid;
	double due;
	String address;
	String contactNo;
	
	public Student1(){
		this.id=id;
		this.name=name;
		this.joinDate=joinDate;
		this.fees=fees;
		this.paid=paid;
		this.due=due;
		this.address=address;
		this.contactNo=contactNo;
		
	}
	


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
	public java.util.Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(java.util.Date joinDate) {
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
		return fees-paid;
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

	

public String toString() {
	return "Student[ID=" + id + ", Name=" + name + ", Course=" + course + ", Join Date=" + joinDate + ", Fees=" + fees + ", Paid=" + paid + ",Due=" + due + ",Address=" + address + ",Contact No =" + contactNo + "]";
}

}