package main12;

public class Application12 {

	public static void main(String[] args) {

		// Thread Yield
		
		// Thread yield mean given chance to another thread to complete the process
		// This regular coding situation process end up with always main thread (see comment on Printer12.java)
		
		Printer12 printer = new Printer12();
		Thread thread = new Thread(printer);
		thread.start();

		for (int a = 0; a < 50; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}

		System.out.println("=============================================================");
	}
}
