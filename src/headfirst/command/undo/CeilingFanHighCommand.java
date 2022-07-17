package headfirst.command.undo;

/**
 * 扇風機を強風にするCommand
 */
public class CeilingFanHighCommand extends CeilingFanCommand {
  
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}
 
    /**
     * 強風Commandを実行
     */
	public void executeCeilingFan() {
		ceilingFan.high();
	}
}
