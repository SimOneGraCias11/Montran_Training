package day4;

class invalidproduct extends Exception {
	public invalidproduct(String msg) {
		super(msg);
	}
}

public class question4 {
	 double deliver(double weight)throws invalidproduct{
		if(weight>1000) {
			throw new invalidproduct("more weight");
		
	}
System.out.println("Product delivered successfully");
return weight;
}
public static void main(String[] args) {
	
	System.out.println("proper");
	try {
		question4 s=new question4();
		double d = s.deliver(500);
		System.out.println("weight:" +d);
		s.deliver(1500);
		
		
	}
	catch(invalidproduct e){
		System.out.println(e);
	}
}

}
