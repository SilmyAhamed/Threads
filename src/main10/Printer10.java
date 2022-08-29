package main10;

public class Printer10 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			System.out.println("Child: " + " | " + i);
		}
	}
}
