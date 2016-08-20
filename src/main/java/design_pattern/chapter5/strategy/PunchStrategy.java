package design_pattern.chapter5.strategy;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class PunchStrategy implements AttackStrategy {
	@Override
	public void attack() {
		System.out.println("펀치 공격");
	}
}
