package headfirst.command.party;

/**
 * 扇風機を強風にするCommand
 */
public class CeilingFanHighCommand extends CeilingFanCommand {

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	/**
	 * 前の風の強さの状態を変更し、強風Commandを実行
	 */
	public void execute() {
		super.execute();
		ceilingFan.high();
	}
}
