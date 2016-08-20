package design_pattern.chapter6.static_class;

/**
 * Created by wayne on 2016. 6. 14..
 */
public class Printer {
	private static int counter = 0;
	public synchronized static void print(String str) {
		counter++;
		System.out.println(str + counter);
	}
}
