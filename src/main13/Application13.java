package main13;

public class Application13 {

	public static void main(String[] args) {

		// Thread Sleep & Interrupt
		// Sleep mean waiting the process for certain time period
		// Interrupt mean terminate the waiting process period(terminate the sleep)
		// One interrupt only for one sleep
		
		Printer13 printer = new Printer13();
		Thread printThread = new Thread(printer);
		printThread.start();

		for (int a = 0; a < 50; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}

		System.out.println("=============================================================");
		printThread.interrupt(); // One interrupt only for one sleep
	}
}
