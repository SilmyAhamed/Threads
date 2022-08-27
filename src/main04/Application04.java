package main04;

public class Application04 {

	public static void main(String[] args) {
		
		Printer04 printer04 = new Printer04();
		printer04.start();
		
		for(int a=0; a<=100; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}
	}
}
