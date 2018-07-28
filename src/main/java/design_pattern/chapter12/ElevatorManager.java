package design_pattern.chapter12;

import com.sun.javafx.scene.traversal.Direction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wayne
 * @version 1.0
 */
public class ElevatorManager {
    private List<ElevatorController> controllerList;
    private SchedulingStrategyID strategyID;

    public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
        controllerList = new ArrayList<>(controllerCount);

        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(1);
            controllerList.add(controller);
        }

        this.strategyID = strategyID;
    }

    public void setStrategyID(SchedulingStrategyID strategyID) {
        this.strategyID = strategyID;
    }

    public void requestElevator(int destination, Direction direction) {
        // 전략 ID에 해당하는 스케쥴러 사용
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllerList.get(selectedElevator).goToFloor(destination);
    }
}



