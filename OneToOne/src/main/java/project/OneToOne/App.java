package project.OneToOne;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		System.out.println(session);
		
//		Question q=new Question();
//		q.setQuestionId(2);
//		q.setQuestion("What is Java?");
//		
//		Answer a=new Answer();
//		a.setAnswerId(5);
//		a.setAnswer("Its an programming language.");
//		
//		Answer a1=new Answer();
//		a1.setAnswerId(50);
//		a1.setAnswer("It is platform independent.");
//		
//		Answer a2=new Answer();
//		a2.setAnswerId(15);
//		a2.setAnswer("Object Oriented.");
//		
//		List<Answer> ans =new ArrayList<Answer>();
//		
//		ans.add(a);
//		ans.add(a1);
//		ans.add(a2);
//
//		a.setQuestion(q);
//		q.setAns(ans);
//		a1.setQuestion(q);
//		a2.setQuestion(q);
//		
//		Transaction tx=session.beginTransaction();
//		session.save(a);
//		session.save(a1);
//		session.save(a2);

		
//		session.save(q);
//		tx.commit();
		
		Employee emp=new Employee();
		emp.setEmpId(2);
		emp.setName("Simone");
		
		Employee emp1=new Employee();
		emp1.setEmpId(22);
		emp1.setName("Lincia");
		
		Employee emp2=new Employee();
		emp2.setEmpId(211);
		emp2.setName("Sinora");
		
		Employee emp3=new Employee();
		emp3.setEmpId(451);
		emp3.setName("Aditi");
		
		Project project =new Project();
		project.setProj_id(12);
		project.setProj_name("Unixplore");
		
		Project project1 =new Project();
		project1.setProj_id(34);
		project1.setProj_name("Blood Bank Management");
		
		Project project2 =new Project();
		project2.setProj_id(56);
		project2.setProj_name("Quit Smoking");
		
		List<Employee> e=new ArrayList<Employee>();
		e.add(emp1);
		e.add(emp2);
		e.add(emp);
		e.add(emp3);
		
		List<Project> p =new ArrayList<Project>();
		p.add(project1);
		p.add(project);
		p.add(project2);
		
		List<Project> p1 =new ArrayList<Project>();
		p1.add(project1);
		p1.add(project2);
		
		List<Project> p2 =new ArrayList<Project>();
		p2.add(project);
		p2.add(project);
		
		emp.setProject(p);
		emp1.setProject(p2);
		emp2.setProject(p1);
		emp3.setProject(p);
		
		project1.setEmp(e);
		project2.setEmp(e);
		project.setEmp(e);
		
		Transaction tx=session.beginTransaction();
		session.save(emp);
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		tx.commit();
		factory.close();
	}
}
