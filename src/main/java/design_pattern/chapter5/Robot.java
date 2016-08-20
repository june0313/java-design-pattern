package design_pattern.chapter5;

import design_pattern.chapter5.strategy.AttackStrategy;
import design_pattern.chapter5.strategy.MovingStrategy;

/**
 * Created by wayne on 2016. 6. 11..
 */
public abstract class Robot {
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void attack() {
		attackStrategy.attack();
	}
	public void move() {
		movingStrategy.move();
	}
}
