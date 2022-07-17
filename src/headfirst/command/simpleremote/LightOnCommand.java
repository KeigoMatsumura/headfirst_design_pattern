package headfirst.command.simpleremote;

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
}
