package headfirst.command.party;

/**
 * テレビオフCommand
 */
public class TVOffCommand implements Command {
	private TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	/**
	 * テレビオフ
	 */
	public void execute() {
		tv.off();
	}

	/**
	 * オン状態に戻す
	 */
	public void undo() {
		tv.on();
	}
}
