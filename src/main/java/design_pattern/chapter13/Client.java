package design_pattern.chapter13;

import design_pattern.chapter13.door.Door;
import design_pattern.chapter13.door.DoorFactory;
import design_pattern.chapter13.motor.Direction;
import design_pattern.chapter13.motor.Motor;
import design_pattern.chapter13.motor.MotorFactory;

public class Client {
	public static void main(String[] args) {
		Door lgDoor = DoorFactory.createDoor(VendorId.LG);
		Motor lgMotor = MotorFactory.createMotor(VendorId.LG);
		lgMotor.setDoor(lgDoor);
		lgDoor.open();
		lgMotor.move(Direction.UP);
	}
}
