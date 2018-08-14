package design_pattern.chapter13.elevator;

import design_pattern.chapter13.door.Door;
import design_pattern.chapter13.door.SamsungDoor;
import design_pattern.chapter13.motor.Motor;
import design_pattern.chapter13.motor.SamsungMotor;

public class SamsungElevatorFactory extends ElevatorFactory {

	@Override
	public Door createDoor() {
		return new SamsungDoor();
	}

	@Override
	public Motor createMotor() {
		return new SamsungMotor();
	}
}
