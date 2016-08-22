package design_pattern.chapter11.v3;

import com.sun.javafx.scene.traversal.Direction;
import design_pattern.chapter11.v1.Door;

/**
 * @author wayne
 * @version 1.0
 */
public class HyundaiMotor extends Motor {
	public HyundaiMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("현대 모터 구동!!!");
	}
}
