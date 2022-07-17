package headfirst.command.remote;

/**
 * 扇風機をオフにするCommand
 */
public class CeilingFanOffCommand implements Command {
	private CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
    /**
     * オフCommandを実行
     */
	public void execute() {
		ceilingFan.off();
	}
}
