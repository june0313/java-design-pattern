package design_pattern.chapter12;

/**
 * @author wayne
 * @version 1.0
 */
public class ElevatorController {
	private int id;
	private int curFloor;

	public ElevatorController(int id) {
		this.id = id;
		this.curFloor = 1;
	}

	public void goToFloor(int destination) {
		System.out.printf("Elevator [%d] Foolr : %d\n", this.id, this.curFloor);

		this.curFloor = destination;
		System.out.println("==> " + this.curFloor);
	}
}
