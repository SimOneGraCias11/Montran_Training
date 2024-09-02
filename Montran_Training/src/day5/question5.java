package day5;

class operation {
	int a[] = new int[5];
	boolean writing = false;

	synchronized void writeA() {
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			System.out.println("writing" + a[i]);
		}
		writing = true;
		notify();// when writing is done
	}

	synchronized void readA() {
		while (!writing) {
			try {
				wait();// wait until writing thread is finish
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("reading" + a[i]);
		}
	}

}

class WriteThreads extends Thread {
	operation op;

	public WriteThreads(operation op) {
		this.op = op;
	}

	public void run() {
		op.writeA();
	}

}

class ReadThreads extends Thread {
	operation op;

	public ReadThreads(operation op) {
		this.op = op;
	}

	public void run() {
		op.readA();
	}

}

public class question5 {
	public static void main(String[] args) {
		operation i = new operation();
		WriteThreads write = new WriteThreads(i);
		ReadThreads read = new ReadThreads(i);

		write.start();
		read.start();

	}
}
