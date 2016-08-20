package design_pattern.chapter10;

/**
 * Created by wayne on 2016. 6. 20..
 */
public class TrafficDecorator extends DisplayDecorator {
	public TrafficDecorator(Display display) {
		super(display);
	}

	@Override
	public void draw() {
		super.draw();
		this.drawTraffic();
	}

	private void drawTraffic() {
		System.out.println("\t교통량 표시");
	}
}
