package headfirst.command.undo;

/**
 * 扇風機を普風にするCommand
 */
public class CeilingFanMediumCommand extends CeilingFanCommand {
  
	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}
 
    /**
     * 普風Commandを実行
     */
	public void executeCeilingFan() {
		ceilingFan.medium();
	}
}
