package day3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

public class practice4 {

	public static void main(String[] args)throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class empc=Class.forName("day3.emp");
		emp ob=new emp(11,"Simone",11.0f,88.0);
		Field[] field =empc.getDeclaredFields();
		System.out.println(empc.getName());
		System.out.println(empc.getSuperclass());
		
		for(Field f:field) {
			if(f.getName().equals("f1"))
			{
				f.setAccessible(true);
				f.set(ob, 222.4f);
			}
			System.out.println("-->"+f.get(ob));
			System.out.println(f.getName());
		}
		
		Constructor empco[]=empc.getDeclaredConstructors();
		
		for(Constructor con:empco) {
			System.out.println("constructor"+con);
			System.out.println("count :"+con.getParameterCount());
			
			Parameter[] parameters=con.getParameters();
			for(Parameter parameter :parameters) {
				System.out.println("parameter"+parameter);
			}
			
				
		}

	}

}
