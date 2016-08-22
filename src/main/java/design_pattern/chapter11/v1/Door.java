package design_pattern.chapter11.v1;

/**
 * @author wayne
 * @version 1.0
 */
public class Door {
	private DoorStatus doorStatus;

	public Door() {
		this.doorStatus = DoorStatus.CLOSED;
	}

	public DoorStatus getDoorStatus() {
		return doorStatus;
	}

	public void close() {
		this.doorStatus = DoorStatus.CLOSED;
	}

	public void open() {
		this.doorStatus = DoorStatus.OPENED;
	}
}
