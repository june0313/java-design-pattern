package design_pattern.chapter6.static_class;

/**
 * Created by wayne on 2016. 6. 14..
 */
public class UserThread extends Thread {
	public UserThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		Printer.print(Thread.currentThread().getName() + " print using .");
	}
}
