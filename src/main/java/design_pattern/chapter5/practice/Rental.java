package design_pattern.chapter5.practice;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class Rental {
	private Member member;
	private Book book;
	private PriceStrategy priceStrategy;
	private int rentalCount;

	public Rental(Member member, Book book, PriceStrategy priceStrategy, int rentalCount) {
		this.member = member;
		this.book = book;
		this.priceStrategy = priceStrategy;
		this.rentalCount = rentalCount;

		// 대여 금액 누적
		this.member.addRentalPrice(this.getRentalPrice());

		System.out.print(book.getTitle() + " " + this.rentalCount + "권 대여.");
		System.out.println(" 원가 : " + this.book.getOriginalPrice() * this.rentalCount + ", 할인가 : " + this.getRentalPrice());
	}

	public long getRentalPrice() {
		return priceStrategy.getRentalPrice(book.getOriginalPrice(), rentalCount);
	}
}
