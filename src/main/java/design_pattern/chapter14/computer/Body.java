package design_pattern.chapter14.computer;

public class Body implements ComputerDevice {
	private int price;
	private int power;

	public Body(int price, int power) {
		this.price = price;
		this.power = power;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getPower() {
		return this.power;
	}
}
