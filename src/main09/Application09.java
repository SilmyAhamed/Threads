package main09;

public class Application09 {

	public static void main(String[] args) {

		// Thread Priority

		// Thread priority has total values 10
		// Thread priority not start with zero
		// Max values is 10, low value is 1, mid values is 5
		// If set priority value more than 10 it will get an error
		// Default priority is 5 wrong

		Printer09 printer = new Printer09();
		Thread thread = new Thread(printer);
		
		// Child thread priority is 10
		// Majority child thread cases print first
		thread.setPriority(10);
		
		System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
		System.out.println("Child Thread Priority: " + thread.getPriority());
		
		thread.start();

		for (int a = 0; a < 50; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}
		
		System.out.println("=============================================================");
	}
}
