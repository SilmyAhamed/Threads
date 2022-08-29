package main11;

public class Application11 {

	public static void main(String[] args) {

		// Thread Join
		
		// Thread join mean, T1 process is waiting until T2 process will complete
		// Certain condition also to T1 process ex: join(long ms)
		
		// Below example main thread waiting until child thread complete
		
		Printer11 printer = new Printer11();
		Thread thread = new Thread(printer);
		thread.start();
		
		try {
			// Example 01:
			//thread.join(); // Child thread process first
			//thread.join(1000); // Waiting for 1000ms after this main thread process will start
			thread.join(1000, 345); // join(milliseconds, nanoseconds)
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int a = 0; a < 50; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}
		
		System.out.println("=============================================================");
	}
}
