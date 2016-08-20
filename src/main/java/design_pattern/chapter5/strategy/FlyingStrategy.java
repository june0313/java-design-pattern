package design_pattern.chapter5.strategy;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class FlyingStrategy implements MovingStrategy {
	@Override
	public void move() {
		System.out.println("난다");
	}
}
