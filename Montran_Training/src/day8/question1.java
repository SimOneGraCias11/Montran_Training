package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1[]= {"Hello","Hi","Bye","Good","Hello","Good","Happy","C++","Java"};
		String str2[]= {"Hi","Hi","Hello","Bye","good","Good","C++","Java","Happy"};
		
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		list1.addAll(Arrays.asList(str1));
		list2.addAll(Arrays.asList(str2));
		
		System.out.println(list1);
		System.out.println(list2);
		for(int i=0;i< list1.size();i++) {
			if(list1.get(i).equals(list2.get(i)))
				System.out.print("yes ");
			else {
				System.out.print("NO ");
			}
		}
		}
}
