package design_pattern.chapter12.manager;

import com.sun.javafx.scene.traversal.Direction;
import design_pattern.chapter12.controller.ElevatorController;
import design_pattern.chapter12.scheduler.ElevatorScheduler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wayne
 * @version 1.0
 */
public abstract class ElevatorManager {
    private List<ElevatorController> controllerList;

    public ElevatorManager(int controllerCount) {
        controllerList = new ArrayList<>(controllerCount);

        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(1);
            controllerList.add(controller);
        }
    }

    /**
     * hook method
     */
    protected abstract ElevatorScheduler getScheduler();

    /**
     * template method
     */
    public void requestElevator(int destination, Direction direction) {
        // 하위 클래스에서 오버라이드된 getScheduler()를 호출
        ElevatorScheduler scheduler = getScheduler();
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllerList.get(selectedElevator).goToFloor(destination);
    }
}



