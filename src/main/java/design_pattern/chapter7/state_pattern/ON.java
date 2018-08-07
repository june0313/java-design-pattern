package design_pattern.chapter7.state_pattern;

/**
 * Created by wayne on 2016. 6. 15..
 */
public class ON implements State {
	private static ON on = new ON();
	private ON() {}

	public static ON getInstance() {
		return on;
	}

	@Override
	public void onButtonPushed(Light light) {
		System.out.println("취침등 상태");
		light.setState(SLEEPING.getInstance());
	}

	@Override
	public void offButtonPushed(Light light) {
		System.out.println("Light Off");
		light.setState(OFF.getInstance());
	}
}
