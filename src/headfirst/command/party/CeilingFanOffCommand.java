package headfirst.command.party;

/**
 * 扇風機をオフにするCommand
 */
public class CeilingFanOffCommand extends CeilingFanCommand{

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	/**
	 * 前の風の強さの状態を変更し、オフCommandを実行
	 */
	public void execute() {
		super.execute();
		ceilingFan.off();
	}
}
