package design_pattern.chapter12.manager;

import design_pattern.chapter12.scheduler.ElevatorScheduler;
import design_pattern.chapter12.scheduler.ThroughputScheduler;

public class ThroughputSchedulingElevatorManager extends ElevatorManager {
    public ThroughputSchedulingElevatorManager(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        return ThroughputScheduler.getInstance();
    }
}
