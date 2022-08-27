package main03;

public class Application03 {

	public static void main(String[] args) {
		
		Printer03 printer03 = new Printer03();
		printer03.start();
		
		for(int a=0; a<=100; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}
	}
}
