package assignment12.hybernate;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;


public class App 
{
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		System.out.println(session);
		
		Person person =new Person();
		person.setPerId(102);
		person.setAge(21);
		person.setName("Simone");
		
		Passport passport =new Passport();
		passport.setPassid(111);
		passport.setCity("london");
		passport.setValid(5);
		
		person.setPassport(passport);
		passport.setPerson(person);
		
		Transaction tx=session.beginTransaction();
		session.save(passport);
		tx.commit();
		
	}
}