package springjdbc.spring;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springjdbc/spring/employee.xml");
		Edao e=(Edao) ctx.getBean("Edao");
		e.saveEmp(new Employee(1,"Simone","Gracias","Vasai",20000));
	}
	
}
