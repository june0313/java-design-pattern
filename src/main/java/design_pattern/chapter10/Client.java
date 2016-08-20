package design_pattern.chapter10;

/**
 * Created by wayne on 2016. 6. 20..
 */
public class Client {
	public static void main(String[] args) {
		Display loadDisplay = new RoadDisplay();
		loadDisplay.draw();

		Display roadWithLaneDisplay = new LaneDecorator(new RoadDisplay());
		roadWithLaneDisplay.draw();

		Display roadWithTrafficDisplay = new TrafficDecorator(new RoadDisplay());
		roadWithTrafficDisplay.draw();

		Display roadWithLaneAndTrafficDisplay = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndTrafficDisplay.draw();

		Display roadWithCrossingDisplay = new CrossingDecorator(new RoadDisplay());
		roadWithCrossingDisplay.draw();
	}
}
