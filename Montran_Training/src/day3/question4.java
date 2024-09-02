package day3;

interface cal{
	double add(double a,double b);
	
	double sub(double a,double b);
	
	double div(double a,double b);
	
	double mul(double a,double b);
}
public class question4 {
	
	
	public static void main(String[] args) {
		double n=5.32;
		double n1=3.22;
		cal c=new cal() {

			@Override
			public double add(double a, double b) {
				// TODO Auto-generated method stub
				return a+b;
			}

			@Override
			public double sub(double a, double b) {
				// TODO Auto-generated method stub
				return a-b;
			}

			@Override
			public double div(double a, double b) {
				// TODO Auto-generated method stub
				return a/b;
			}

			@Override
			public double mul(double a, double b) {
				// TODO Auto-generated method stub
				return a*b;
			}
			
		};
		System.out.println("add:"+c.add(n, n1));
		System.out.println("add:"+c.sub(n, n1));
		System.out.println("add:"+c.div(n, n1));
		System.out.println("add:"+c.mul(n, n1));

	}

}
