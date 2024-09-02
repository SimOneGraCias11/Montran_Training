package day5;

class India {
	boolean p1 = false;

	synchronized void part1() {
		System.out.println("Welcome to India");
		p1 = true;
		notify();
	}

	synchronized void part2() {
		while (!p1) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Do visit Taj Mahal");
	}

}

class Threads1 extends Thread {
	India india;

	public Threads1(India india) {
		this.india = india;
	}

	public void run() {
		india.part1();
	}

}

class Threads2 extends Thread {
	India india;

	public Threads2(India india) {
		this.india = india;
	}

	public void run() {
		india.part2();
	}

}

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		India i = new India();
		Threads1 t = new Threads1(i);
		Threads2 h = new Threads2(i);

		h.start();
		t.start();

	}

}
