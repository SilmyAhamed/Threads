package main10;

public class Application10 {

	public static void main(String[] args) {

		// Thread Priority
		// Default priority is 5 wrong (with example)
		// #Rule01: Main thread default priority only is 5
		// #Rule02: Any thread created, it get inherit parent thread value

		Printer10 printer = new Printer10();
		
		System.out.println("Before Main Thread Priority Set: " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7); // Main thread priority is 7
		
		Thread thread = new Thread(printer);
		
		// Child thread going to not setting priority
		//thread.setPriority(10);
		
		System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
		System.out.println("Child Thread Priority: " + thread.getPriority());
		
		thread.start();

		for (int a = 0; a < 50; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}
		
		System.out.println("=============================================================");
	}
}
