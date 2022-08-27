package main04;

public class Printer04 extends Thread {

	@Override
	public void start() {
		super.start(); // Now it will break down previous example
		System.out.println("This is start!");
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<=10; i++) {
			System.out.println("Child: " + currentThread().getName() + " | " + i);
		}
	}
}
