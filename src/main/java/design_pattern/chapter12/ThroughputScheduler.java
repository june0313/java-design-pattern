package design_pattern.chapter12;

import com.sun.javafx.scene.traversal.Direction;

/**
 * 처리량을 최대로 하는 스케쥴링 전략
 */
public class ThroughputScheduler implements ElevatorScheduler {
	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 0;
	}
}
