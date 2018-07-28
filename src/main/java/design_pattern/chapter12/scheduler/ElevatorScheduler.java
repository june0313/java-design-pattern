package design_pattern.chapter12.scheduler;

import com.sun.javafx.scene.traversal.Direction;
import design_pattern.chapter12.manager.ElevatorManager;

public interface ElevatorScheduler {
    int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
