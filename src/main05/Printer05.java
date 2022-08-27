package main05;

public class Printer05 extends Thread {

	@Override
	public void run() {
		
		for(int i=0; i<=100; i++) {
			System.out.println("Child: " + currentThread().getName() + " | " + i);
		}
	}
}
