package design_pattern.chapter13.elevator;

import design_pattern.chapter13.door.Door;
import design_pattern.chapter13.door.HyundaiDoor;
import design_pattern.chapter13.motor.HyundaiMotor;
import design_pattern.chapter13.motor.Motor;

public class HyundaiElevatorFactory extends ElevatorFactory {
	@Override
	public Door createDoor() {
		return new HyundaiDoor();
	}

	@Override
	public Motor createMotor() {
		return new HyundaiMotor();
	}
}
