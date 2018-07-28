package design_pattern.chapter12.manager;

import design_pattern.chapter12.scheduler.ElevatorScheduler;
import design_pattern.chapter12.scheduler.ResponseTimeScheduler;

public class ResponseTimeSchedulingElevatorManager extends ElevatorManager {
    public ResponseTimeSchedulingElevatorManager(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        return ResponseTimeScheduler.getInstance();
    }
}
