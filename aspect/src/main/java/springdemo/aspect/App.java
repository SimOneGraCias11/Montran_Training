package springdemo.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ctx =new ClassPathXmlApplicationContext("springdemo/aspect/payment.xml");

    	payment p=(payment)ctx.getBean("payment");
    	int result= p.doPayment();
    	System.out.println("payment result :" +result );
    	
    }
}
