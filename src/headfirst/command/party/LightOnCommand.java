package headfirst.command.party;

/**
 * 照明オンCommand
 */
public class LightOnCommand implements Command {
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	/**
	 * 照明オン
	 */
	public void execute() {
		light.on();
	}

	/**
	 * 照明を元のオフに戻す
	 */
	public void undo() {
		light.off();
	}
}
