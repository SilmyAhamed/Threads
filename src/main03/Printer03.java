package main03;

public class Printer03 extends Thread {

	// This will only execute main thread, will not allowed to create new thread
	@Override
	public void start() {
		System.out.println("This is start!");
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<=10; i++) {
			System.out.println("Child: " + currentThread().getName() + " | " + i);
		}
	}
}
