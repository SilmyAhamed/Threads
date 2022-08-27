package main06;

public class Application06 {

	public static void main(String[] args) {
		
		Printer06 printer06 = new Printer06();
		// But this line break previous example(main05) rule
		// But after exit main() then also child thread execution happening, because of before exit main() recored values printing
		printer06.setDaemon(true);
		printer06.start();
		
		for(int a=0; a<=10; a++) {
			System.out.println("Main: " + Thread.currentThread().getName() + " | " + a);
		}
		
		System.out.println("===============================================================");
	}
}
