package headfirst.command.undo;


/**
 * 扇風機を弱風にするCommand
 */
public class CeilingFanLowCommand extends CeilingFanCommand {

	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

    /**
     * 弱風Commandを実行
     */
	public void executeCeilingFan() {
		ceilingFan.low();
	}
}
