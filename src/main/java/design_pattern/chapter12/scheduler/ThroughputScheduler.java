package design_pattern.chapter12.scheduler;

import com.sun.javafx.scene.traversal.Direction;
import design_pattern.chapter12.manager.ElevatorManager;

/**
 * 처리량을 최대로 하는 스케쥴링 전략
 */
public class ThroughputScheduler implements ElevatorScheduler {
    private static ElevatorScheduler scheduler;

    private ThroughputScheduler() {
    }

    public static ElevatorScheduler getInstance() {
        if (scheduler == null) {
            scheduler = new ThroughputScheduler();
        }

        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;
    }
}
