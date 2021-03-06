package design_pattern.chapter13;

import design_pattern.chapter13.door.Door;
import design_pattern.chapter13.elevator.ElevatorFactory;
import design_pattern.chapter13.elevator.ElevatorFactoryFactory;
import design_pattern.chapter13.motor.Direction;
import design_pattern.chapter13.motor.Motor;

public class Client {
	public static void main(String[] args) {
		ElevatorFactory factory = ElevatorFactoryFactory.getFactory(VendorId.HYUNDAI);

		Door door = factory.createDoor();
		Motor motor = factory.createMotor();
		motor.setDoor(door);

		door.open();
		motor.move(Direction.UP);
	}
}
