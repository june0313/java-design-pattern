package design_pattern.chapter8.command_pattern;

/**
 * Created by wayne on 2016. 6. 17..
 */
public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);

		Button button1 = new Button(lampOnCommand);
		button1.pressed();

		Alarm alarm = new Alarm();
		Command alarmOnCommand = new AlarmOnCommand(alarm);

		Button button2 = new Button(alarmOnCommand);
		button2.pressed();

		button2.setCommand(lampOnCommand);
		button2.pressed();
	}
}
