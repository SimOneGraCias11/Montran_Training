package day7;

import java.util.Arrays;

public class question5 {
	public static<T extends Comparable <T>> void SortGeneric(T[] arr) {
		
		//bubble sort
int n=arr.length;
for(int i=0;i<n-1;i++) {
	for(int j=0;j<n-1-i;j++) {
		if(arr[j].compareTo(arr[j+1])>0) {
			T temp =arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			
		}
		
	}
}
}
public static void main(String[] args) {
	
	//sort integers
	Integer a[] = { 1, 2, 6, 3, 4 };
	System.out.println("Integer Before sorting :"+Arrays.toString(a));
	SortGeneric(a);
	System.out.println("Integer After sorting:"+Arrays.toString(a));

	
	//sort Double
		Double d[] = { 1.1, 2.9, 6.2, 2.33, 1.24 };
		System.out.println("Double Before sorting :"+Arrays.toString(d));
		SortGeneric(d);
		System.out.println("Double After sorting:"+Arrays.toString(d));

		//sort float
		Float f[] = { 3.1f, 1.22f, 6.2f, 1.3f, 2.14f,1.3f };
		System.out.println("Float Before sorting :"+Arrays.toString(f));
		SortGeneric(f);
		System.out.println("Float After sorting:"+Arrays.toString(f));
		
		//sort char
		Character c[] = { 'A','Z','Q','G','S'};
		System.out.println("Character Before sorting :"+Arrays.toString(c));
		SortGeneric(c);
		System.out.println("Character After sorting:"+Arrays.toString(c));
		
		//sort string
		String s[] = { "Hello","Hi","Apple","Java","Aeroplane"};
		System.out.println("String Before sorting :"+Arrays.toString(s));
		SortGeneric(s);
		System.out.println("String After sorting:"+Arrays.toString(s));
}


}
