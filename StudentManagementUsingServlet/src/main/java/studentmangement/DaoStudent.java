package studentmangement;
import java.sql.*;
import java.util.*;


public class DaoStudent {

	private static Connection con;
		
	
	private static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","2311");
		
		System.out.println("Connection establish");
		return con;
}

	public static void addStudent(Student student) {
		try {
			con = getConnection();
		PreparedStatement pstmt =con.prepareStatement("Insert into student1(Name,Course,JoinDate,Fees,Paid,Due,Address,Contactno)Values(?,?,?,?,?,?,?,?)");
		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getCourse());
		pstmt.setDate(3,new java.sql.Date(student.getJoinDate().getTime()));
		pstmt.setDouble(4, student.getFees());
		pstmt.setDouble(5, student.getPaid());
		pstmt.setDouble(6, student.getDue());
		pstmt.setString(7, student.getAddress());
		pstmt.setString(8, student.getContactNo());

		pstmt.executeUpdate();
		
		}catch(Exception e) {
			System.out.println(e);
		}
	
}

	public static List<Student> getStudents(){
		
	List<Student> students=new ArrayList<>();
		try {
			con = getConnection();

			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student1");
			while(rs.next()) {
				Student student =new Student();
				student.setId(rs.getInt("ID"));
				student.setName(rs.getString("Name"));
				student.setCourse(rs.getString("Course"));
				student.setJoinDate(rs.getDate("JoinDate"));
				student.setFees(rs.getDouble("Fees"));
				student.setPaid(rs.getDouble("Paid"));
				student.setDue(rs.getDouble("Due"));
				student.setAddress(rs.getString("Address"));
				student.setContactNo(rs.getString("Contactno"));
			
				students.add(student);

				
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
return students;
	}
	
	public static Student getStudent(int id) {
		Student student =null;
		try {
			PreparedStatement pstmt =con.prepareStatement("Select *from student1 where ID=?");
			pstmt.setInt(1, id);
			try(ResultSet rs=pstmt.executeQuery()){
				if(rs.next()) {
					student =new Student();
					student.setId(rs.getInt("ID"));
					student.setName(rs.getString("Name"));
					student.setCourse(rs.getString("Course"));
					student.setJoinDate(rs.getDate("JoinDate"));;
					student.setFees(rs.getDouble("Fees"));
					student.setPaid(rs.getDouble("Paid"));
					student.setDue(rs.getDouble("Due"));
					student.setAddress(rs.getString("Address"));;
					student.setContactNo(rs.getString("Contactno"));
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return student;
		
	}
	
	public static void updateStudent(int id,Student student) {
		
	try {
		con = getConnection();

		PreparedStatement pstmt =con.prepareStatement("update student1 set Name =?,Course =?,JoinDate=?,Fees=?,Paid=?,Due=?,Address=?,Contactno=? Where ID="+id);
		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getCourse());
		pstmt.setDate(3,new java.sql.Date(student.getJoinDate().getTime()));
		pstmt.setDouble(4, student.getFees());
		pstmt.setDouble(5, student.getPaid());
		pstmt.setDouble(6, student.getDue());
		pstmt.setString(7, student.getAddress());
		pstmt.setString(8, student.getContactNo());
	

		int i=pstmt.executeUpdate();
		System.out.println(i+" row updated");
	
	}catch(Exception e) {
e.printStackTrace();	}
}
	
	public static void deleteStudent(int id) {
		try {
			con = getConnection();

			PreparedStatement pstmt =con.prepareStatement("delete from student1 where id =?");
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
	}catch(Exception e) {
		System.out.println(e);
	}
		
	}
}
