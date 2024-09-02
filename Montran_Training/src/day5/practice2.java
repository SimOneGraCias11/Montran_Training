package day5;
class ThreadOne extends Thread{
	public void run() {
		
		System.out.println("thread state:" +getState());
		for(int i=0;i<5;i++) {
			System.out.println("working "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("thread state now:"+ getState());
	}
}
public class practice2 {
public static void main(String[] args) {
	ThreadOne t=new ThreadOne();
	
	System.out.println("alive :" +t.isAlive());
	System.out.println("thread state "+t.getState());
	t.start();
	
	System.out.println("alive :" +t.isAlive());
	System.out.println("thread state "+t.getState());

	try {
		Thread.sleep(1000);
	}catch(Exception e) {
		e.printStackTrace();
	}

System.out.println("thread state now:"+ t.getState());
}
}

