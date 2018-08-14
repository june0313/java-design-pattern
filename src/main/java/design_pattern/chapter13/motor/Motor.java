package design_pattern.chapter13.motor;

import design_pattern.chapter13.door.Door;

public abstract class Motor {
	private Door door;

	public void move(Direction direction) {
		door.close();
		doMove();
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	protected abstract void doMove();
}
