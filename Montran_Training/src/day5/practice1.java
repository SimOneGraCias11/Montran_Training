package day5;

//synchronized (inter thread communication)
class Printer{
	int pages=100;
	synchronized void printPages(int page) {
		System.out.println("Printing pages");
		
		for(int i=0;i<100;i++) {
			
			}
		if(this.pages<page) {
			System.out.println("pages are less in printer");
			
			try {
				wait();
				System.out.println("Waiting........");
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("After notify this r the pages:" + this.pages);
		System.out.println("Process complete");
	}
		synchronized void addpages(int no){
			this.pages += no;
			notify();
	}
}

public class practice1 {
public static void main(String[] args) {
	Printer p=new Printer();
	new Thread() {
		@Override
		public void run() {
			p.printPages(120);

		}
	}.start();
	
	new Thread() {
		@Override
		public void run() {
			p.printPages(140);

		}
	}.start();
	
	new Thread() {
		@Override
		public void run() {
			p.printPages(160);

		}
	}.start();
	new Thread() {
		@Override
		public void run() {
			p.addpages(120);
		}
	}.start();
	new Thread() {
		@Override
		public void run() {
			p.addpages(1100);
		}
	}.start();
}
}
