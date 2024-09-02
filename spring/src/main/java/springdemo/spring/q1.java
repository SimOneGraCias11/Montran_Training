package springdemo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class q1 {
	 public static void main( String[] args )
	    {
	    	
	    	
	    	ApplicationContext ctx =new ClassPathXmlApplicationContext("springdemo/spring/country.xml");
	      
	    	System.out.println( "By getter and setter method" );
	    	country c =(country) ctx.getBean("p1");
	    	System.out.println(c);

}
}