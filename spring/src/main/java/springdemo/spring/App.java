package springdemo.spring;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext ctx =new ClassPathXmlApplicationContext("springdemo/spring/student.xml");
      
    	System.out.println( "By getter and setter method" );
    	Student stud =(Student) ctx.getBean("p1");
    	System.out.println(stud);
    	
    	
//    	System.out.println( "By constructor" );
//    	Student stud1 =(Student) ctx.getBean("p3");
//    	System.out.println(stud1);
//    	
    }
}
