package headfirst.command.party;

/**
 * ステレオオンCommand
 */
public class StereoOnCommand implements Command {
	private Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	/**
	 * ステレオオン
	 */
	public void execute() {
		stereo.on();
	}

	/**
	 * オフ状態に戻す
	 */
	public void undo() {
		stereo.off();
	}
}
