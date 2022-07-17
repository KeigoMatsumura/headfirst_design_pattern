package headfirst.command.party;

/**
 * 扇風機を弱風にするCommand
 */
public class CeilingFanLowCommand extends CeilingFanCommand{
	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	/**
	 * 前の風の強さの状態を変更し、弱風Commandを実行
	 */
	public void execute() {
		super.execute();
		ceilingFan.high();
	}
}
