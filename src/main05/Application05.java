package main05;

public class Application05 {

	public static void main(String[] args) {
		
		Printer05 printer05 = new Printer05();
		printer05.start();
		
		for(int a=0; a<=10; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}
		
		// This line will proof, if main() exit then over all function will exit is a wrong!
		System.out.println("===============================================================");
	}
}
