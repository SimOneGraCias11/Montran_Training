package maven.HibernateMaven;

import java.util.*;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class Native_queries {
	public static void main(String[] args) {
		
	SessionFactory factory =new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	System.out.println(session);
	
	String sql="select * from cust";
	SQLQuery q=session.createSQLQuery(sql);
	q.addEntity(Customer.class);
	List l=q.list();
	
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		Customer cust=(Customer) itr.next();
		System.out.println(cust.getId() + "  " +cust.getName() + "  " + cust.getCity());
	}
	}
	

}
