package headfirst.command.party;

/**
 * ステレオをCD再生モードでオンにするCommand
 */
public class StereoOnWithCDCommand extends StereoOnCommand {
	private Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		super(stereo);
	}

	/**
	 * ステレオをCD再生モードでオン
	 */
	public void execute() {
		super.execute();//ステレオオン
		stereo.setCD();//CD再生モードに設定
		stereo.setVolume(11);//ボリュームを11に設定
	}
}
