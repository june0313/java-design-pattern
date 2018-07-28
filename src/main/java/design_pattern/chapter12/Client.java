package design_pattern.chapter12;

import com.sun.javafx.scene.traversal.Direction;
import design_pattern.chapter12.manager.DynamicSchedulingElevatorManager;
import design_pattern.chapter12.manager.ElevatorManager;
import design_pattern.chapter12.manager.ResponseTimeSchedulingElevatorManager;
import design_pattern.chapter12.manager.ThroughputSchedulingElevatorManager;

public class Client {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler = new ResponseTimeSchedulingElevatorManager(2);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughputScheduler = new ThroughputSchedulingElevatorManager(2);
        emWithThroughputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new DynamicSchedulingElevatorManager(2);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);
    }
}
