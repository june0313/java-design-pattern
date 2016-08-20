package design_pattern.chapter7.state_pattern;

/**
 * Created by wayne on 2016. 6. 15..
 */
public class Light {
	private State state;

	public Light() {
		this.state = OFF.getInstance();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void onButtonPushed() {
		state.onButtonPushed(this);
	}

	public void offButtonPushed() {
		state.offButtonPushed(this);
	}
}
