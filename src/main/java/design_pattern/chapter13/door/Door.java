package design_pattern.chapter13.door;

public abstract class Door {
	private DoorStatus doorStatus;

	public Door() {
		this.doorStatus = DoorStatus.CLOSED;
	}

	/**
	 * template method
	 */
	public void close() {
		if (doorStatus.isClosed()) {
			return;
		}

		doClose();
		doorStatus = DoorStatus.CLOSED;
	}

	/**
	 * template method
	 */
	public void open() {
		if (doorStatus.isOpened()) {
			return;
		}

		doOpen();
		doorStatus = DoorStatus.OPENED;
	}

	protected abstract void doClose();
	protected abstract void doOpen();
}
