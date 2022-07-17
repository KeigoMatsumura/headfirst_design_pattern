package headfirst.command.party;

/**
 * 扇風機を普風にするCommand
 */
public class CeilingFanMediumCommand extends CeilingFanCommand {

	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	/**
	 * 前の風の強さの状態を変更し、普風Commandを実行
	 */
	public void execute() {
		super.execute();
		ceilingFan.medium();
	}
}
