package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// executor service:(scheduled thread pool)
public class practice3 {
	public static void main(String[] args) {

		/*
		 * ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
		 * Runnable task1 = () -> System.out.println("executing task1");
		 * scheduler.schedule(task1, 2, TimeUnit.SECONDS);
		 * 
		 * Runnable task2 = () -> System.out.println("executing task2");
		 * scheduler.scheduleAtFixedRate(task2, 1, 5, TimeUnit.SECONDS);
		 * 
		 * Runnable task3 = () -> System.out.println("executing task3");
		 * scheduler.scheduleWithFixedDelay(task3, 0, 3, TimeUnit.SECONDS);
		 */
		// single thread executor
	//	ExecutorService executor = Executors.newSingleThreadExecutor();

		// fixed thread pool
		// ExecutorService executor=Executors.newFixedThreadPool(2);

		// cached thread pool
			ExecutorService executor = Executors.newCachedThreadPool();

		
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
				System.out.println("Task1......");

			}

		};
		Runnable t2 = () -> {

			System.out.println(Thread.currentThread().getName());
			System.out.println("Task2......");

		};
		Runnable t3 = () -> {

			System.out.println(Thread.currentThread().getName());
			System.out.println("Task3......");

		};

		executor.submit(t1);
		executor.submit(t2);
		executor.submit(t3);
		executor.shutdown();

	}
}
