package design_pattern.chapter12;

import com.sun.javafx.scene.traversal.Direction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wayne
 * @version 1.0
 */
public class ElevatorManager {
	private List<ElevatorController> controllerList;
	private ThroughputScheduler scheduler;

	public ElevatorManager(int controllerCount) {
		controllerList = new ArrayList<>(controllerCount);

		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(1);
			controllerList.add(controller);
		}

		scheduler = new ThroughputScheduler();
	}

	public void requestElevator(int destination, Direction direction) {
		int selectedElevator = scheduler.selectElevator(this, destination, direction);

		controllerList.get(selectedElevator).goToFloor(destination);
	}

}



