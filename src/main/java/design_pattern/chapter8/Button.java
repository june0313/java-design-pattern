package design_pattern.chapter8;

/**
 * Created by wayne on 2016. 6. 17..
 */
public class Button {
	private Lamp lamp;

	public Button(Lamp lamp) {
		this.lamp = lamp;
	}

	public void pressed() {
		this.lamp.turnOn();
	}
}
