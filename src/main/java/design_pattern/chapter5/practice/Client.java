package design_pattern.chapter5.practice;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class Client {
	public static void main(String[] args) {
		Member member1 = new Member("june");
		Book book1 = new Book("toby's spring", 2009, 35000);
		Book book2 = new Book("Effective Java", 2001, 12500);

		Rental rental1 = new Rental(member1, book1, new BookDiscountPriceStrategy(), 1);
		Rental rental2 = new Rental(member1, book1, new MemberDiscountPriceStrategy(), 5);
		Rental rental3 = new Rental(member1, book2, new DefaultPriceStrategy(), 10);
	}
}
