package springdemo.spring;

import java.util.*;

public class Student {

	int age;
	String fname;
	String lname;
	List<Double> marks ;
	Set<String> hobbies;
	Map<String,Integer>Education;
	
	Address address ;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int age, String fname, String lname, List<Double> marks, Set<String> hobbies,
			Map<String, Integer> education, Address address) {
		super();
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.marks = marks;
		this.hobbies = hobbies;
		Education = education;
		this.address = address;
	}

	public Student(Address address) {
		super();
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<Double> getMarks() {
		return marks;
	}

	public void setMarks(List<Double> marks) {
		this.marks = marks;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Map<String, Integer> getEducation() {
		return Education;
	}

	public void setEducation(Map<String, Integer> education) {
		Education = education;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", fname=" + fname + ", lname=" + lname + ", marks=" + marks + ", hobbies="
				+ hobbies + ", Education=" + Education + ", address=" + address + "]";
	}
	
	
}