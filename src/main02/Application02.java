package main02;

public class Application02 {

	public static void main(String[] args) {
		
		Printer02 printer02 = new Printer02();
		//printer02.start();
		printer02.run(); // Directly call run() instead of start(), output always start with child thread
		
		for(int a=0; a<=100; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}
	}
}
