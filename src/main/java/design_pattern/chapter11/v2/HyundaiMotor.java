package design_pattern.chapter11.v2;

import com.sun.javafx.scene.traversal.Direction;
import design_pattern.chapter11.v1.Door;
import design_pattern.chapter11.v1.DoorStatus;
import design_pattern.chapter11.v1.MotorStatus;

/**
 * @author wayne
 * @version 1.0
 */
public class HyundaiMotor extends Motor {
	public HyundaiMotor(Door door) {
		super(door);
	}

	private void moveHyundaiMotor(Direction direction) {
		// Hyundai motor를 구동시킴
	}

	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING) {
			return;
		}

		DoorStatus doorStatus = this.door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED) {
			door.close();
		}

		moveHyundaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
}
