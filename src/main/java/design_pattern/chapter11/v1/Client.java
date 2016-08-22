package design_pattern.chapter11.v1;

import com.sun.javafx.scene.traversal.Direction;

/**
 * @author wayne
 * @version 1.0
 */
public class Client {
	public static void main(String[] args) {
		Door door = new Door();
		HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
		hyundaiMotor.move(Direction.UP);
	}
}
