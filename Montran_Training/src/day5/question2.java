package day5;

class Multithreaded extends Thread {

	double[] angle;
	Object lock;

	public Multithreaded(double[] angle, Object lock) {
		this.angle = angle;
		this.lock = lock;
	}

	public void run() {
		System.out.println("thread state:" + getState());
		synchronized (lock) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Angle: " + angle[i]);
				System.out.println("Sin: " + Math.sin(angle[i]));
				System.out.println("Cos: " + Math.cos(angle[i]));
				System.out.println("Tan: " + Math.tan(angle[i]));

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Root extends Thread {

	double[] no;
	Object lock;

	public Root(double[] no, Object lock) {
		this.no = no;
		this.lock = lock;
	}

	public void run() {
		System.out.println("thread state:" + getState());
		synchronized (lock) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Number: " + no[i]);
				System.out.println("Square Root: " + Math.sqrt(no[i]));

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
}

public class question2 {
	public static void main(String[] args) {
		double[] angle = { 30, 45, 60, 90, 120 };
		double[] no = { 45, 25, 9, 81, 4 };
		Object lock = new Object();
		Multithreaded c = new Multithreaded(angle, lock);
		Root l = new Root(no, lock);

		System.out.println("Thread State " + c.getState());
		System.out.println("alive :" + l.isAlive());

		c.start();
		l.start();
	}
}
