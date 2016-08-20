package design_pattern.chapter5.practice;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class BookDiscountPriceStrategy implements PriceStrategy {
	@Override
	public long getRentalPrice(long originalPrice, int rentalCount) {
		return (long) (originalPrice * rentalCount * 0.95);
	}
}
