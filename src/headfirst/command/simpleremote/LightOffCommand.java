package headfirst.command.simpleremote;

/**
 * 照明オフCommand
 */
public class LightOffCommand implements Command {
	private Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	/**
	 * 照明オフ
	 */
	public void execute() {
		light.off();
	}
}
