package maven.HibernateMaven;

//import java.sql.Date;
import java.util.Iterator;
import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//Transient state(Create)
		//Customer ob = new Customer( "Sinora", "Pune",new Date("2033/09/09"));
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println(session);
		Transaction tx=session.beginTransaction();
		
		//persistent state
		//session.save(ob);
		//session.getTransaction().commit();
		
		//Read multiple records
		List list=session.createQuery("From Customer").list();
		Iterator itr=list.iterator();
		while(itr.hasNext()) 
		{
			Customer cob=(Customer) itr.next();
			System.out.println(cob.getId()+ " " + cob.getName()+ " " + cob.getCity() + " " + cob.getDop());
			
		}
		
		//Read
		Customer ob=session.get(Customer.class, 1);
		System.out.println(ob.toString());
		
		//update
//		ob.setCity("nashik");
//		session.save(ob);
		
		
		//delete
		session.delete(ob);
		tx.commit();
//	
		
		
			
		//detached state
		factory.close();
		System.out.println("Transaction successfull");
	}
}
