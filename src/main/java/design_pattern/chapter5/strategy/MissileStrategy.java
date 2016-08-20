package design_pattern.chapter5.strategy;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class MissileStrategy implements AttackStrategy {
	@Override
	public void attack() {
		System.out.println("미사일 공격");
	}
}
