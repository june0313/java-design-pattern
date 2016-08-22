package design_pattern.chapter11.practice;

/**
 * @author wayne
 * @version 1.0
 */
public class Customer {
	private String name;
	private int point;

	public Customer(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
