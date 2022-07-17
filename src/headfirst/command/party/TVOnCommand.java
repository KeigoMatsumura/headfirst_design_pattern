package headfirst.command.party;

/**
 * テレビオンCommand
 */
public class TVOnCommand implements Command {
	private TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	/**
	 * テレビオン
	 */
	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	/**
	 * オフ状態に戻す
	 */
	public void undo() {
		tv.off();
	}
}
