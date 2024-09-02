package day2;

class Student {
	int rollNno;
	String name;
	String className;
	
	public Student(int rollNno,String name,String className) {
		this.rollNno=rollNno;
		this.name=name;
		this.className=className;
	}

	public int getRollNno() {
		return rollNno;
	}

	public void setRollNno(int rollNno) {
		this.rollNno = rollNno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
}

abstract class course{
	public abstract void studentData();
		
	public void courseDetails(){
		System.out.println("course name:MNC");
		System.out.println("course duration:2023-2034");
		
	}
}
 class StudentRecord extends course{
	 String sports_activity;
public StudentRecord( String sports_activity) {
	this.sports_activity=sports_activity;
}

	@Override
	public void studentData() {
		Student student =new Student(1,"simone","MCA");
		System.out.println("rollno:"+student.getRollNno());
		System.out.println("name:"+student.getName());
		System.out.println("className:"+student.getClassName());
		System.out.println("sports_activity:"+this.sports_activity);

	}
 }
	class HostelRecord extends course{
		 String hostel_name;
		 int room_no;
	public HostelRecord( String hostel_name,int room_no ) {
		this.hostel_name=hostel_name;
		this.room_no=room_no;
	}

		@Override
		public void studentData() {
			Student student =new Student(2,"sherwin","MCA1");
			System.out.println("rollno:"+student.getRollNno());
			System.out.println("name:"+student.getName());
			System.out.println("hostel_name:"+this.hostel_name);
			System.out.println("room_no:"+this.room_no);

		}
	}
		  class Main1{

				public static void main(String[] args) {
					StudentRecord sr=new StudentRecord("Cricket");
					sr.courseDetails();
					sr.studentData();
					
					
					HostelRecord hr=new HostelRecord("ABC",2);

					hr.courseDetails();
					hr.studentData();
				}
		 }
 
		 
				