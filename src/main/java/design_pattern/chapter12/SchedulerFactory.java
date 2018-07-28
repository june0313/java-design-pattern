package design_pattern.chapter12;

import java.time.LocalDateTime;

public class SchedulerFactory {
    public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
        ElevatorScheduler elevatorScheduler = null;

        switch (strategyID) {
            case RESPONSE_TIME:
                elevatorScheduler = new ResponseTimeScheduler();
                break;
            case THROUGHPUT:
                elevatorScheduler = new ThroughputScheduler();
                break;
            case DYNAMIC:
                if (LocalDateTime.now().getHour() < 13) {
                    elevatorScheduler = new ResponseTimeScheduler();
                } else {
                    elevatorScheduler = new ThroughputScheduler();
                }
                break;
        }

        return elevatorScheduler;
    }
}
