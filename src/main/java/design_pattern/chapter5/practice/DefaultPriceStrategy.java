package design_pattern.chapter5.practice;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class DefaultPriceStrategy implements PriceStrategy {
	@Override
	public long getRentalPrice(long originalPrice, int rentalCount) {
		return originalPrice * rentalCount;
	}
}
