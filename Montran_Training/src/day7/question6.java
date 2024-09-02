package day7;

import java.util.Arrays;
import java.util.List;

public class question6 {

public static <T extends Comparable<T>> void Max(List<? extends Integer> I) {

	int max=I.get(0);

		for (int i = 0; i < I.size(); i++) {
			if (I.get(i).compareTo(max) > 0) {
				max=I.get(i);
			}

		}
		
		
System.out.println("Max:"+max);
}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Integer> gt =Arrays.asList(2,3,1,3);
Max(gt);
}
	
}

