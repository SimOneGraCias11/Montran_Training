package day5;

class Company extends Thread{
	public void run() {
		
		System.out.println("Thread State " +getState());
		System.out.println("alive :" +isAlive());

		for(int i=0;i<1;i++) {
			System.out.println(" Company Name: Montan ");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class City extends Thread{
	public void run() {
		

		for(int i=0;i<1;i++) {
			System.out.println(" City Name: Mumbai ");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Language extends Thread{
	public void run() {
		


		for(int i=0;i<1;i++) {
			System.out.println(" Language Name: Java ");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}


public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company t=new Company();
		City c=new City();
		Language l=new Language();
		
		System.out.println("Thread State " +t.getState());
		System.out.println("alive :" +t.isAlive());
		
		t.start();
		c.start();
		l.start();


	}

}
