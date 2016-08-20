package design_pattern.chapter10;

/**
 * Created by wayne on 2016. 6. 20..
 */
public class CrossingDecorator extends DisplayDecorator {
	public CrossingDecorator(Display display) {
		super(display);
	}

	private void drawCrossing() {
		System.out.println("\t교차로 표시");
	}

	@Override
	public void draw() {
		super.draw();
		this.drawCrossing();
	}
}
