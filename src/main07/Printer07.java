package main07;

public class Printer07 implements Runnable {

	@Override
	public void run() {
		
		for(int i=0; i<=100; i++) {
			System.out.println("Child: " + " | " + i);
		}
	}
}
