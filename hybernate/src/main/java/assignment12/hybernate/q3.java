package assignment12.hybernate;

import java.text.*;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class q3 {
	
	public static void main(String[] args) throws ParseException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		System.out.println(session);
		
		Doctor doctor =new Doctor();
		doctor.setId(1002);
		doctor.setName("Aaron");
		doctor.setSpecialization("Neurologist");
		
		Patient patient =new Patient();
		patient.setPid(111);
		patient.setName("Simone");
		patient.setDOA(new SimpleDateFormat("yyyy-mm-dd").parse("2021-09-02"));
		
		
		Patient patient1 =new Patient();
		patient1.setPid(231);
		patient1.setName("Lincia");
		patient1.setDOA(new SimpleDateFormat("yyyy-mm-dd").parse("2022-11-03"));
		
		Patient patient2 =new Patient();
		patient2.setPid(291);
		patient2.setName("Serena");
		patient2.setDOA(new SimpleDateFormat("yyyy-mm-dd").parse("2012-03-11"));
		
		
		List<Patient> p =new ArrayList<Patient>();
		p.add(patient2);
		p.add(patient1);
		p.add(patient);
		
		doctor.setPatient(p);
		patient.setDoctor(doctor);
		patient1.setDoctor(doctor);
		patient2.setDoctor(doctor);
		
		Transaction tx=session.beginTransaction();
		session.save(doctor);
		tx.commit();
		
		
	}

}
