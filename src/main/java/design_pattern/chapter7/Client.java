package design_pattern.chapter7;

/**
 * Created by wayne on 2016. 6. 15..
 */
public class Client {
	public static void main(String[] args) {
		Light light = new Light();
		light.offButtonPushed();
		light.onButtonPushed();
		light.offButtonPushed();
		light.offButtonPushed();
	}
}
