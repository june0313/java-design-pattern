package design_pattern.chapter13.door;

public enum DoorStatus {
	OPENED, CLOSED;

	public boolean isClosed() {
		return this == CLOSED;
	}

	public boolean isOpened() {
		return this == OPENED;
	}
}
