package design_pattern.chapter7.state_pattern;

/**
 * Created by wayne on 2016. 6. 15..
 */
public interface State {
	void onButtonPushed(Light light);
	void offButtonPushed(Light light);
}
