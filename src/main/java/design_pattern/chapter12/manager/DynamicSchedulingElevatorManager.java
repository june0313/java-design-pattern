package design_pattern.chapter12.manager;

import design_pattern.chapter12.scheduler.ElevatorScheduler;
import design_pattern.chapter12.scheduler.ResponseTimeScheduler;
import design_pattern.chapter12.scheduler.ThroughputScheduler;

import java.time.LocalDateTime;

public class DynamicSchedulingElevatorManager extends ElevatorManager {
    public DynamicSchedulingElevatorManager(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        if (LocalDateTime.now().getHour() < 13) {
            return ResponseTimeScheduler.getInstance();
        } else {
            return ThroughputScheduler.getInstance();
        }
    }
}
