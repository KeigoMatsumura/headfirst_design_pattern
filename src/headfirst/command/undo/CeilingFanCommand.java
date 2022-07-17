package headfirst.command.undo;

/**
 * 扇風機の風を変更するCommand
 * 全ての風変更Commandでundo関連の処理が共通なので、それを記述
 */
public abstract class CeilingFanCommand implements Command {
	protected CeilingFan ceilingFan;//風を変更する扇風機
	private int prevSpeed;//undoのための前の風の強さの状態
  
	public CeilingFanCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
		prevSpeed = CeilingFan.OFF;//最初のundoはオフにする
	}
 
    /**
     * 前の風の強さの状態を変更し、コマンドを実行
     */
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		executeCeilingFan();
	}

	/**
	 * コマンドを実行
	 */
	public abstract void executeCeilingFan();
 
    /**
     * 前の風の状態に戻す
     */
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
