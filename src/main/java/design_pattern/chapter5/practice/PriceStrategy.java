package design_pattern.chapter5.practice;

/**
 * Created by wayne on 2016. 6. 11..
 */
public interface PriceStrategy {
	long getRentalPrice(long originalPrice, int rentalCount);
}
