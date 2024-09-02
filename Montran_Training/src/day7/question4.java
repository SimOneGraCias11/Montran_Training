package day7;

public class question4 {
	public static<T extends Number> void counter(T[] arr) {
		int even=0;
		int odd=0;
		int prime=0;
		
		for(T number:arr) {
			if(isEven((int) number)) {
				even++;
			}else {
				odd++;
			}
			if(isPrime((int) number)) {
				prime++;
			}
		}
		System.out.println("Even no:"+even);
		System.out.println("Odd no:"+odd);
		System.out.println("Prime no:"+prime);
		
		
	}
	public static boolean isEven(int number ) {
		
		return number %2==0;
			
	}
	
	public static boolean isPrime(int number) {
		if(number<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				
				return false;
			}
		}
		
		return true;
	}
public static void main(String[] args) {
	Integer[] intA= {2,1,5,6,3,8,23,42,12,32,45,4,76};
	System.out.println("Numbers:"+java.util.Arrays.toString(intA));
	counter(intA);
}
}

