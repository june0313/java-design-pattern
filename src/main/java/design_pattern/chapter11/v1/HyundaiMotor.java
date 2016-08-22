package design_pattern.chapter11.v1;

import com.sun.javafx.scene.traversal.Direction;

/**
 * @author wayne
 * @version 1.0
 */
public class HyundaiMotor {
	private Door door;
	private MotorStatus motorStatus;

	public HyundaiMotor(Door door) {
		this.door = door;
		this.motorStatus = MotorStatus.STOPPED; // 초기에는 멈춘 상태
	}

	private void moveHyundaiMotor(Direction direction) {
		// Hyundai motor를 구동시킴
	}

	public MotorStatus getMotorStatus() {
		return this.motorStatus;
	}

	public void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
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
