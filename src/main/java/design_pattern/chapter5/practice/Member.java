package design_pattern.chapter5.practice;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class Member {
	private String name;
	private long rentalPrice;

	public Member(String name) {
		this.name = name;
		rentalPrice = 0L;
	}

	public void addRentalPrice(long price) {
		this.rentalPrice += price;
	}
}
