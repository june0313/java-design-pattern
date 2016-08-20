package design_pattern.chapter5;

import design_pattern.chapter5.strategy.FlyingStrategy;
import design_pattern.chapter5.strategy.MissileStrategy;
import design_pattern.chapter5.strategy.PunchStrategy;
import design_pattern.chapter5.strategy.WalkingStrategy;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class Client {
	public static void main(String[] args) {
		Robot taeKwonV = new TaeKwonV("TaeKwonV");
		Robot atom = new Atom("Atom");

		taeKwonV.setMovingStrategy(new WalkingStrategy());
		taeKwonV.setAttackStrategy(new MissileStrategy());

		atom.setMovingStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new PunchStrategy());


		System.out.println("My name is " + taeKwonV.getName());
		taeKwonV.move();
		taeKwonV.attack();

		System.out.println("--------------------");

		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();
	}
}
