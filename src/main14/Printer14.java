package main14;

public class Printer14 implements Runnable {

	@Override
	public void run() {

		try {
			Thread.sleep(10000);

		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("I am up.................");
		}

		for (int i = 0; i < 50; i++) {
			System.out.println("Child: " + " | " + i);
		}
	}
}
