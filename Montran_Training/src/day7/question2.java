package day7;

class Average<M extends Number> {
	M ob[];

	Average(M ob[]) {
		this.ob = ob;

	}
public double getAverage() {
	double sum=0.0;
	for(M i:ob) {
		sum+= i.doubleValue();	
	}
	
double avgg = sum/ob.length;
	return avgg;
}
}
public class question2 {

	public static void main(String[] args) {
		Integer[] intArray= {1,2,3};
		Average<Integer> ai=new Average<Integer>(intArray);
		System.out.println("avg of integer is:"+ai.getAverage());
		Double[] dubArray= {12.0,23.8,23.7};
		Average<Double> ad=new Average<Double>(dubArray);
		System.out.println("avg of double is:"+ad.getAverage());
		
		Float[] flArray= {11.0f,32.8f,12.7f};
		Average<Float> af=new Average<Float>(flArray);
		System.out.println("avg of float is:"+af.getAverage());
		
	}

}
