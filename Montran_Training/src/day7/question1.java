package day7;

class MyGenric<G1, G2> {
	G1 g1;
	G2 g2;

	MyGenric(G1 g1, G2 g2) {
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
		return "Name:" + getOb1() + "Year of Birth:" + getOb2();
	}

	public void showDatatype() {
		System.out.println("Class of name:" + g1.getClass().getSimpleName());
		System.out.println("Class of year:" + g2.getClass().getSimpleName());

	}

}

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenric<String, Integer> ob = new MyGenric<String, Integer>("Simone", 2002);// 2 parameter
		System.out.println(ob.toString());
		ob.showDatatype();
	}

}
