package design_pattern.chapter8;

/**
 * Created by wayne on 2016. 6. 17..
 */
public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Button button = new Button(lamp);
		button.pressed()



		;
	}
}
