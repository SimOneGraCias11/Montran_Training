package montran.mavenpro;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class App 
{
   
    	static Configuration cfg = new Configuration();
		
		static SessionFactory factory = cfg.configure().buildSessionFactory();
//		Session session = factory.openSession();
//		System.out.println(session);  
		

	public static void addStudent(Student student) {
		
		Transaction tx=null;
		try (Session session = factory.openSession();){
			 tx=session.beginTransaction();
			session.save(student);
			tx.commit();
			
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();

		}
		e.printStackTrace();
		}
	
}

	public static List<Student> getStudents(){
		
		
		try (Session session = factory.openSession()){
			return session.createQuery("from Student").list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Student getStudent(int id) {
		try (Session session = factory.openSession()){
			return session.get(Student.class, id);
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
}
	
	public static void updateStudent(Student student) {
		
		
		Transaction tx=null;
		try (Session session = factory.openSession()){
			 tx=session.beginTransaction();
			session.update(student);
			session.getTransaction().commit();
			
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();

		}
		e.printStackTrace();
		}
}
	
	public static void deleteStudent(int id) {
		
		Transaction tx=null;
		try (Session session = factory.openSession()){
			 tx=session.beginTransaction();
			 Student student =session.get(Student.class, id);
			 if(student!=null) {
			session.delete(student);
			session.getTransaction().commit();
			 }
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();

		}
		e.printStackTrace();
		}
	factory.close();
	System.out.println("Transaction successfully");
}	
}