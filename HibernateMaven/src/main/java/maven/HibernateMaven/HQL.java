package maven.HibernateMaven;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HQL {
	public static void main(String[] args) {
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		System.out.println(session);
		
		
		//where clause
		//String hql="From Customer c where c.id=2";
//		Query query=session.createQuery(hql);
//		List results=query.list();
//		Iterator itr=results.iterator();
//		while(itr.hasNext()) {
//			Customer cust=(Customer) itr.next();
//			System.out.println(cust.getId() + "  " +cust.getName() + "  " + cust.getCity());
//		}
//		}

		
		//Order by clause 
		//String hql="From Customer c order by c.name desc";
		
		//Group BY clause
//		String hql="Select sum(c.id),c.city From Customer c  group by c.city";
//		Query query=session.createQuery(hql);
//		List <Object[]> results=query.list();
//		for(Object[] obj :results) {
//		
//			System.out.println(obj[0] + " " + obj[1]);
//		}
//		}

		//get Pagination
		
//		String hql="From Customer";
//		Query query=session.createQuery(hql);
//		query.setFirstResult(1);
//		query.setMaxResults(2);
		
		//Update
//		String hql="update Customer set city=:n where id=:i";
//		Transaction tx=session.beginTransaction();
//		Query query =session.createQuery(hql);
//		query.setParameter("n", "london");
//		query.setParameter("i", 3);
//		query.executeUpdate();
//		tx.commit();
		
		//delete
		String hql="delete from Customer where id=2";
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.executeUpdate();
		tx.commit();
		
		//get all records
		String hql1="From Customer";
		Query query1 =session.createQuery(hql1);
		List results=query1.list();
		Iterator itr=results.iterator();
		while(itr.hasNext()) {
			Customer cust=(Customer) itr.next();
			System.out.println(cust.getId() + "  " +cust.getName() + "  " + cust.getCity());
			}
		
	}
}
