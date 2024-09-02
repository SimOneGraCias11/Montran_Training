package day3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class question6 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class empc=Class.forName("day3.customer");
		Field field =empc.getDeclaredField("Name");
		Field field1 =empc.getDeclaredField("id");
		System.out.println(empc.getName());

		Constructor c=empc.getDeclaredConstructor();
		Object o=c.newInstance();
		
		
		Method show=empc.getDeclaredMethod("show", null);
		show.invoke(o);
		field.set(o, "abc");
		field1.set(o,321);
		Method show1=empc.getDeclaredMethod("show", null);
		show1.invoke(o);
	}

}

