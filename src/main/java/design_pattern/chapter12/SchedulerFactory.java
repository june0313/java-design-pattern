package design_pattern.chapter12;

import java.time.LocalDateTime;

public class SchedulerFactory {
    public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
        ElevatorScheduler elevatorScheduler = null;

        switch (strategyID) {
            case RESPONSE_TIME:
                elevatorScheduler = ResponseTimeScheduler.getInstance();
                break;
            case THROUGHPUT:
                elevatorScheduler = ThroughputScheduler.getInstance();
                break;
            case DYNAMIC:
                if (LocalDateTime.now().getHour() < 13) {
                    elevatorScheduler = ResponseTimeScheduler.getInstance();
                } else {
                    elevatorScheduler = ThroughputScheduler.getInstance();
                }
                break;
        }

        return elevatorScheduler;
    }
}
