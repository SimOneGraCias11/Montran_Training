package day8;

import java.util.concurrent.BlockingQueue;

 class Producer implements Runnable{
BlockingQueue<Integer> obj;

public Producer(BlockingQueue<Integer> obj) {
	this.obj=obj;
}
public void run() {
	for(int i=0;i<=3;i++) {
		try {
			obj.put(i);
			System.out.println("Producer"+i);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
}

class Consumer implements Runnable{
BlockingQueue<Integer> obj;

int taken=-1;
public Consumer(BlockingQueue<Integer> obj) {
	this.obj=obj;
}
public class question6 {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}