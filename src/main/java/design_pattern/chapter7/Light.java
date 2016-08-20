package design_pattern.chapter7;

/**
 * Created by wayne on 2016. 6. 15..
 */
public class Light {
	private static int ON = 0;
	private static int OFF = 1;
	private int state;

	public Light() {
		this.state = OFF;
	}

	public void onButtonPushed() {
		if (state == ON) {
			System.out.println("no action");
		} else {
			System.out.println("Light On");
			state = ON;
		}

	}

	public void offButtonPushed() {
		if (state == OFF) {
			System.out.println("no action");
		} else {
			System.out.println("Light Off");
			state = OFF;
		}

	}
}
