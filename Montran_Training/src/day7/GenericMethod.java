package day7;

import java.util.*;

public class GenericMethod {
public static <E> void printArray(E[]inputArray) {
	for(E Element:inputArray) {
		System.out.printf("%s ",Element);
	}
	System.out.println();
}
//UpperBound Wildcard

private static double sum(List<? extends Number> MyList) {
	double sum=0.0;
	for(Number iterator:MyList) {
		sum=sum+iterator.doubleValue();
		}
	return sum;
	
}
//LowerBound Wildcard

private static double total(List<? super Number>MyList) {
	double sum=0.0;
	for(Object iterator:MyList) {
		sum=sum+((Number) iterator).doubleValue();
		}
	return sum;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] intArray= {1,2,3};
Double[] dubArray= {12.0,23.8,23.7};
Character[] charArray={'A','V','S'};
String [] strArray= {"ABC","HELLO","HI"};

System.out.println("int array");
printArray(intArray);

System.out.println("double array");
printArray(dubArray);

System.out.println("char array");
printArray(charArray);
System.out.println("string array");
printArray(strArray);

//Upperbound
List<Integer> i =Arrays.asList(1,2,3,4,5);

System.out.println("Sum:"+sum(i));

//Lowerbound
List<Number> nu =Arrays.asList(1,2,3,4,5);  

System.out.println("Total:"+total(nu));

	}

}
