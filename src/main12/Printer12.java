package main12;

public class Printer12 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			// This regular coding situation process end up with always main thread
			// Now process always end up with child thread, its mean given chance to main thread to complete process
			// Because we mention child thread is a yield thread
			// Note: If OS not support primitive scheduling, then this function not going to work
			Thread.yield();
			System.out.println("Child: " + " | " + i);
		}
	}
}
