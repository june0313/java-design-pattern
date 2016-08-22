package design_pattern.chapter11.v3;

import com.sun.javafx.scene.traversal.Direction;
import design_pattern.chapter11.v1.Door;
import design_pattern.chapter11.v1.DoorStatus;
import design_pattern.chapter11.v1.MotorStatus;

/**
 * @author wayne
 * @version 1.0
 */
public abstract class Motor {
	protected Door door;
	private MotorStatus motorStatus;

	public Motor(Door door) {
		this.door = door;
		this.motorStatus = MotorStatus.STOPPED;
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
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

		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}

	protected abstract void moveMotor(Direction direction);
}
