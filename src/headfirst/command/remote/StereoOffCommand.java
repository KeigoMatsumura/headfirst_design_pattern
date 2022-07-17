package headfirst.command.remote;

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
}
