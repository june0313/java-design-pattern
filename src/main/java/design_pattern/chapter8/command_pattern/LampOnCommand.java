package design_pattern.chapter8.command_pattern;

/**
 * Created by wayne on 2016. 6. 17..
 */
public class LampOnCommand implements Command {
	private Lamp lamp;

	public LampOnCommand(Lamp lamp) {
		this.lamp = lamp;
	}

	@Override
	public void execute() {
		this.lamp.turnOn();
	}
}
