package design_pattern.chapter13.elevator;

import design_pattern.chapter13.door.Door;
import design_pattern.chapter13.door.SamsungDoor;
import design_pattern.chapter13.motor.Motor;
import design_pattern.chapter13.motor.SamsungMotor;

public class SamsungElevatorFactory extends ElevatorFactory {
	private static final ElevatorFactory INSTANCE = new SamsungElevatorFactory();

	public static ElevatorFactory getInstance() {
		return INSTANCE;
	}

	private SamsungElevatorFactory() {
	}

	@Override
	public Door createDoor() {
		return new SamsungDoor();
	}

	@Override
	public Motor createMotor() {
		return new SamsungMotor();
	}
}
