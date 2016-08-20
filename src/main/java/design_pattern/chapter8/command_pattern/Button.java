package design_pattern.chapter8.command_pattern;

/**
 * Created by wayne on 2016. 6. 17..
 */
public class Button {
	private Command command;

	public Button(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressed() {
		this.command.execute();
	}
}
