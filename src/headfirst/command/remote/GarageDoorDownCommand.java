package headfirst.command.remote;

/**
 * ガレージのシャッターを下げるCommand
 */
public class GarageDoorDownCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	/**
	 * ガレージのシャッターを下げる
	 */
	public void execute() {
		garageDoor.up();
	}
}
