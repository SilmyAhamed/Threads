package main11;

public class Printer11 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			System.out.println("Child: " + " | " + i);
			
			try {
				// Deep on next video
				Thread.sleep(250); // Little bit slow down, 4 lines per seconds
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
