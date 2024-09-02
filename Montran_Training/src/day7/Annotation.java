package day7;

class Bank{
	public void show() {
		System.out.println("Bank class");
	}
		@Deprecated
		public void m() {
			System.out.println("hello");
		}
	}


class Atm extends Bank{
	@Override
public void show() {
System.out.println("atm show(int)");	
}
}
public class Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Atm atm=new Atm();
atm.show();
atm.m();
	}

}
