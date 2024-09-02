package day2;

//person1 class (superclass)
class Person11 {
	String name;
	String address;

	public Person11(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		System.out.println(name + "(" + address + ")");
		return name;
}
}
// child class -Student
class student11 extends Person11 {
	int num_course;
	String[] courses;
	int[] grades;

	public student11(String name, String address) {
		super(name, address);
		this.num_course = 0;
		this.courses = new String[10];
		this.grades = new int[10];
	}

	@Override
	public String toString() {
		return "Student:" + getName() + "Address:" + getAddress();

	}

	public void addCourses(String course, int grade) {
		courses[num_course] = course;
		grades[num_course] = grade;
		++num_course;

	}

	public void printGrades() {
		for (int i = 0; i < num_course; ++i) {
			System.out.println(courses[i] + ":" + grades[i]);
		}
	}

	public double getavg() {
		int sum = 0;
		for (int i = 0; i < num_course; i++) {
			sum += grades[i];
		}
		return (double)sum / num_course;
	}
}

// Teacher class

class Teacher extends Person11 {

	int num_course;
	String[] courses;

	public Teacher(String name, String address) {
		super(name, address);
		this.num_course = 0;
		this.courses = new String[10];
	}

	@Override
	public String toString() {
		return "teacher:" + getName() + "Address:" + getAddress();

	}

	public boolean addCourse(String course) {
		for (int i = 0; i < num_course; i++) {
			if (courses[i].equals(course))
				return false;
		}
		courses[num_course] = course;
		num_course ++;
		return true;

	}

	public boolean removecourse(String course) {
		boolean found = false;
		int coursee = -1;

		for (int i = 0; i < num_course; i++) {
			if (courses[i].equals(course)) {
				coursee = i;
				found = true;
				break;

			}

		}
		if (found) {
			for (int i = coursee; i < num_course - 1; i++) {
				courses[i] = courses[i + 1];
			}
			num_course --;
			return true;
		} else {

			return false;
		}
	}

}

public class question2 {
	public static void main(String[] args) {
		student11 s = new student11("Simone", "123 ABC ");
		System.out.println(s);
		s.addCourses("XYZ", 87);
		s.addCourses("Maths",97);

		s.printGrades();
		System.out.println("avg:"+ s.getavg() );

		Teacher t = new Teacher("Alex", "Street way");
		System.out.println(t);
		String[] courses = { "XYZ", "Maths", "AI", "DC" };
		for (String course : courses) {
			if (t.addCourse(course)) {
				System.out.println(course + "added");
			} else {
				System.out.println(course + " cant add");
			}
		}
		for (String course : courses) {
			if (t.removecourse(course)) {
				System.out.println(course + "removed");

			} else {
				System.out.println(course + "cant remove");
			}
		}
	}

}
