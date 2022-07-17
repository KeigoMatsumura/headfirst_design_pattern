package headfirst.command.simpleremote;

/**
 * ガレージのシャッターを上げるCommand
 */
public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	/**
	 * シャッターを上げる
	 */
	public void execute() {
		garageDoor.up();
	}
}
