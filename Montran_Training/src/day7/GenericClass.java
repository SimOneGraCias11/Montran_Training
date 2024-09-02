package day7;

class MyGen<M> {
	M ob;

	MyGen(M ob) {
		this.ob = ob;

	}

	M getOb() {
		return ob;

	}
}

class MyGen1<G1, G2> {
	G1 g1;
	G2 g2;

	MyGen1(G1 g1, G2 g2) {
		this.g1 = g1;
		this.g2 = g2;

	}

	G1 getOb1() {
		return g1;

	}

	G2 getOb2() {
		return g2;

	}

	public String toString() {
		return "Name:" + getOb1() + "Id:" + getOb2();
	}

}

//Bounded Type
class MyGen3<R extends Number> {
	R ob4;

	MyGen3(R ob4) {
		this.ob4 = ob4;

	}

	R getOb() {
		return ob4;

	}
}

public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//MyGen<Integer> ob1=new MyGen<Integer>(5);
		// MyGen<String> ob1=new MyGen<String>("Simone); --single parameter

		MyGen1<String, Integer> ob3 = new MyGen1<String, Integer>("abc", 123);// 2 parameter

		// MyGen3<String> ob5 =new MyGen3<String>(6); --error bcuz ur bounded by int

		MyGen3<Integer> ob5 = new MyGen3<Integer>(6);
		System.out.println("Generic:" + ob5.getOb());
	}

}
