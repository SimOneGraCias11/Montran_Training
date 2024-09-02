package springdemo.springassign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class q3 {

	
	 public static void main( String[] args )
	    {
	    	ApplicationContext ctx =new ClassPathXmlApplicationContext("springdemo/springassign/mobile.xml");
	        
	    	System.out.println( "By type" );
	    	Mobile m1 =(Mobile) ctx.getBean("p1");
	    	System.out.println(m1);
	    	
	    	System.out.println( "By Name" );
	    	Mobile m2 =(Mobile) ctx.getBean("p2");
	    	System.out.println(m2);
	    	
	    	System.out.println( "By constructor" );
	    	Mobile m3 =(Mobile) ctx.getBean("p3");
	    	System.out.println(m3);
	    }
	 
}
