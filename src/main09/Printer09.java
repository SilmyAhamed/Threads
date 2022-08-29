package main09;

public class Printer09 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			System.out.println("Child: " + " | " + i);
		}
	}
}
