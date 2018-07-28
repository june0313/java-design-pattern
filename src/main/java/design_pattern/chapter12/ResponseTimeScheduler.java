package design_pattern.chapter12;

import com.sun.javafx.scene.traversal.Direction;

/**
 * 대기 시간 최소화 스케쥴링 전략
 */
public class ResponseTimeScheduler implements ElevatorScheduler {
    private static ElevatorScheduler scheduler;

    private ResponseTimeScheduler() {

    }

    public static ElevatorScheduler getInstance() {
        if (scheduler == null) {
            scheduler = new ResponseTimeScheduler();
        }

        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;
    }
}
