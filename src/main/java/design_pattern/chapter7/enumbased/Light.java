package design_pattern.chapter7.enumbased;

public class Light {
	private State state;

	public Light() {
		state = State.OFF;
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
