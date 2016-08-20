package design_pattern.chapter10;

/**
 * Created by wayne on 2016. 6. 20..
 */
public abstract class DisplayDecorator implements Display {
	private Display display;

	public DisplayDecorator(Display display) {
		this.display = display;
	}

	@Override
	public void draw() {
		display.draw();
	}
}
