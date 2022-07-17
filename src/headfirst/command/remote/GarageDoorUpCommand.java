package headfirst.command.remote;

/**
 * ガレージのシャッターを上げるCommand
 */
public class GarageDoorUpCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	/**
	 * ガレージのシャッターを上げる
	 */
	public void execute() {
		garageDoor.up();
	}
}
