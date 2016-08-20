package design_pattern.chapter6;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void print() {
		Printer printer = Printer.getPrinter();
		printer.print(this.name + " print using " + printer.toString());
	}
}
