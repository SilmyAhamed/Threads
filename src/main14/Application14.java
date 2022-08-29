package main14;

public class Application14 {

	public static void main(String[] args) {

		// Thread Sleep & Interrupt
		
		Printer14 printer = new Printer14();
		Thread printThread = new Thread(printer);
		printThread.start();
		printThread.interrupt(); // Interrupt will be waiting till a sleep trigger

		for (int a = 0; a < 50; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}

		System.out.println("=============================================================");
		//printThread.interrupt();
	}
}
