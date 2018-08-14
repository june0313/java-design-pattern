package design_pattern.chapter13.elevator;

import design_pattern.chapter13.door.Door;
import design_pattern.chapter13.motor.Motor;

public abstract class ElevatorFactory {
	public abstract Door createDoor();
	public abstract Motor createMotor();
}
