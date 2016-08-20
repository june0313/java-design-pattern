package design_pattern.chapter6;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class Printer {
	private static Printer printer = new Printer();
	private int counter = 0;
	private Printer() {}

	public static Printer getPrinter() {
//		if (printer == null) {
//
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {}
//
//			printer = new Printer();
//		}

		return printer;
	}

	public void print(String str) {
		synchronized (this) {
			counter++;
			System.out.println(str + ", " + counter);
		}
	}
}
