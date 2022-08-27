package main02;

public class Printer02 extends Thread {

	@Override
	public void run() {
		
		for(int i=0; i<=10; i++) {
			System.out.println("Child: " + currentThread().getName() + " | " + i);
		}
	}
}
