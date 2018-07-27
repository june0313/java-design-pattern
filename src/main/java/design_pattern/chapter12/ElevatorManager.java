package design_pattern.chapter12;

import com.sun.javafx.scene.traversal.Direction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wayne
 * @version 1.0
 */
public class ElevatorManager {
	private List<ElevatorController> controllerList;

	public ElevatorManager(int controllerCount) {
		controllerList = new ArrayList<>(controllerCount);

		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(1);
			controllerList.add(controller);
		}
	}

	public void requestElevator(int destination, Direction direction) {
		ElevatorScheduler scheduler;

		if (LocalDateTime.now().getHour() < 13) {
			scheduler = new ResponseTimeScheduler();
		} else {
			scheduler = new ThroughputScheduler();
		}

		int selectedElevator = scheduler.selectElevator(this, destination, direction);

		controllerList.get(selectedElevator).goToFloor(destination);
	}

}



