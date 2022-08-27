package main;

public class Application {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		printer.start();
		
		for(int a=0; a<=100; a++) {
			System.out.println("Main: " + a);
		}
	}
}
