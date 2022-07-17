package headfirst.command.party;

/**
 * 扇風機の風を変更するCommand
 * 全ての風変更Commandでundo関連の処理が共通なので、それを記述
 */
public class CeilingFanCommand implements Command {
	protected CeilingFan ceilingFan;//風を変更する扇風機
	private int prevSpeed;//undoのための前の風の強さの状態

	public CeilingFanCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
		prevSpeed = CeilingFan.OFF;//最初のundoはオフにする
	}

	/**
	 * 前の風の強さの状態を変更
	 */
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
	}
	
	/**
	 * 前の風の状態に戻す
	 */
	public void undo() {
		switch (prevSpeed) {
			case CeilingFan.HIGH: 	ceilingFan.high(); break;
			case CeilingFan.MEDIUM: ceilingFan.medium(); break;
			case CeilingFan.LOW: 	ceilingFan.low(); break;
			default: 				ceilingFan.off(); break;
		}
	}
}
