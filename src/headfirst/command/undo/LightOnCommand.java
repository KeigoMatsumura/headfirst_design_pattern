package headfirst.command.undo;

/**
 * 照明オンCommand
 */
public class LightOnCommand implements Command {
	private Light light;
	private int level;
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
    /**
     * 照明オン
     */
	public void execute() {
        level = light.getLevel();
		light.on();
	}
 
    /**
     * 照明を元のオフに戻す
     */
	public void undo() {
		light.dim(level);
	}
}
