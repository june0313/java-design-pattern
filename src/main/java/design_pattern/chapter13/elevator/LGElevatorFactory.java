package design_pattern.chapter13.elevator;

import design_pattern.chapter13.door.Door;
import design_pattern.chapter13.door.LGDoor;
import design_pattern.chapter13.motor.LGMotor;
import design_pattern.chapter13.motor.Motor;

public class LGElevatorFactory extends ElevatorFactory {
	private static final ElevatorFactory INSTANCE = new LGElevatorFactory();

	public static ElevatorFactory getInstance() {
		return INSTANCE;
	}

	private LGElevatorFactory() {
	}

	@Override
	public Door createDoor() {
		return new LGDoor();
	}

	@Override
	public Motor createMotor() {
		return new LGMotor();
	}
}
