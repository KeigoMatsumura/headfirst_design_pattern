package headfirst.command.remote;

/**
 * 扇風機をオンにするCommand
 */
public class CeilingFanOnCommand implements Command {
	private CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	/**
	 * オンCommandを実行(強さは強)
	 */
	public void execute() {
		ceilingFan.high();
	}
}
