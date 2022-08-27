package main07;

public class Application07 {

	public static void main(String[] args) {
		// Runnable interface will not support start() & setDaemon()
		
		Printer07 printer = new Printer07();
		// We should create Thread object in Runnable interface
		// Then this will support to start() function
		// Thread class support default constructor but Runnable interface support multiple constructor
		// But same output
		Thread thread = new Thread(printer);
		thread.start();
		
		for(int a=0; a<=10; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}
		
		System.out.println("===============================================================");
	}
}
