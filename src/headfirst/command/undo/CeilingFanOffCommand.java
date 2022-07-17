package headfirst.command.undo;

/**
 * 扇風機をオフにするCommand
 */
public class CeilingFanOffCommand extends CeilingFanCommand {

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

    /**
     *  オフCommandを実行
     */
	public void executeCeilingFan() {
		ceilingFan.off();
	}
}
