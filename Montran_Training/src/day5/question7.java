package day5;

class array extends Thread {
	String[] arr;

	public array(String[] arr) {
		this.arr = arr;
	}

	public void run() {
		synchronized (this) {
			for (String el : arr) {
				System.out.print(el + " ");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}
}

public class question7 {
	public static void main(String[] args) {
		String arr1[] = { "I", "am", "in", "synchronized", "block", "please", "wait!\n" };
		String arr2[] = { "nice", "day" };

		array ar = new array(arr1);
		array br = new array(arr2);

		ar.start();
		try {
			ar.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		br.start();

	}

}
