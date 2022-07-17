package headfirst.command.party;

/**
 * ステレオオフCommand
 */
public class StereoOffCommand implements Command {
	private Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	/**
	 * ステレオオフ
	 */
	public void execute() {
		stereo.off();
	}

	/**
	 * オン状態に戻す
	 */
	public void undo() {
		stereo.on();
	}
}
