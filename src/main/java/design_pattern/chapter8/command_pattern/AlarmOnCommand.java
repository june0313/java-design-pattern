package design_pattern.chapter8.command_pattern;

/**
 * Created by wayne on 2016. 6. 17..
 */
public class AlarmOnCommand implements Command {
	private Alarm alarm;

	public AlarmOnCommand(Alarm alarm) {
		this.alarm = alarm;
	}

	@Override
	public void execute() {
		this.alarm.start();
	}
}
