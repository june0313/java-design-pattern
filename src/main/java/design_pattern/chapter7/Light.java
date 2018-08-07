package design_pattern.chapter7;

/**
 * Created by wayne on 2016. 6. 15..
 */
class Light {
	private static int ON = 0;
	private static int OFF = 1;
	private static int SLEEPING = 2;

	private int state;

	public Light() {
		this.state = OFF;
	}

	public void onButtonPushed() {
		if (state == ON) {
			System.out.println("취침등 상태");
			state = SLEEPING;
		} else if (state == SLEEPING) {
			System.out.println("Light On");
			state = ON;
		} else {
			System.out.println("Light On");
			state = ON;
		}
	}

	public void offButtonPushed() {
		if (state == OFF) {
			System.out.println("no action");
		} else if (state == SLEEPING) {
			System.out.println("Light Off");
			state = OFF;
		} else {
			System.out.println("Light Off");
			state = OFF;
		}
	}
}
