package headfirst.command.undo;

/**
 * 照明オフCommand
 */
public class LightOffCommand implements Command {
	private Light light;
	private int level;
	public LightOffCommand(Light light) {
		this.light = light;
	}

    /**
     * 照明オフ
     */
	public void execute() {
        level = light.getLevel();
		light.off();
	}

    /**
     * 照明をもとのオンに戻す
     */
	public void undo() {
		light.dim(level);
	}
}
