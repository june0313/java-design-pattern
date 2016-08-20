package design_pattern.chapter10;

/**
 * Created by wayne on 2016. 6. 20..
 *
 */
public class LaneDecorator extends DisplayDecorator {
	public LaneDecorator(Display display) {
		super(display);
	}

	@Override
	public void draw() {
		super.draw();
		this.drawLane();
	}

	private void drawLane() {
		System.out.println("\t차선 표시");
	}
}
