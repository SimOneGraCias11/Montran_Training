package day5;

class Even extends Thread{
	public void run() {
		
		System.out.println("thread state:" +getState());
		for(int i=2;i<20;i+=2) {
			System.out.println("Even no: "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Odd extends Thread{
	public void run() {
		
		System.out.println("thread state:" +getState());
		for(int i=1;i<19;i+=2) {
			System.out.println("Odd no: "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class question3 {
	public static void main(String[] args) {
		Even e=new Even();
		Odd o=new Odd();
		
		e.start();
		o.start();
	}

}
