package design_pattern.chapter7.state_pattern;

/**
 * Created by wayne on 2016. 6. 15..
 */
public class OFF implements State {
	private static OFF off = new OFF();
	private OFF () {}

	public static OFF getInstance() {
		return off;
	}

	@Override
	public void onButtonPushed(Light light) {
		System.out.println("Light On");
		light.setState(ON.getInstance());
	}

	@Override
	public void offButtonPushed(Light light) {
		System.out.println("noAction");
	}
}
