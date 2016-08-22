package design_pattern.chapter11.v2;

import design_pattern.chapter11.v1.Door;
import design_pattern.chapter11.v1.MotorStatus;

/**
 * Created by wayne on 2016. 8. 20..
 *
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


}
