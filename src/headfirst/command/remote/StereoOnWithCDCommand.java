package headfirst.command.remote;

/**
 * ステレオをCD再生モードでオンにするCommand
 */
public class StereoOnWithCDCommand implements Command {
	private Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
    /**
     * ステレオをCD再生モードでオン
     */
	public void execute() {
		stereo.on();//ステレオオン
		stereo.setCD();//CD再生モードに設定
		stereo.setVolume(11);//ボリュームを11に設定
	}
}
