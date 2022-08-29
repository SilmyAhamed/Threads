package main13;

public class Printer13 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(5000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Child: " + " | " + i);
		}
	}
}
