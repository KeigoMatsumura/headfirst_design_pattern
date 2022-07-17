package headfirst.command.simpleremote;

/**
 * リモコンクラス
 */
public class SimpleRemoteControl {
	private Command slot;
 
	public SimpleRemoteControl() {}
 
	/**
	 * Commandをボタンにセットする
	 * @param command 設定するCommand
	 */
	public void setCommand(Command command) {
		slot = command;
	}
 
	/**
	 * ボタンを押してCommandを実行
	 */
	public void buttonWasPressed() {
		slot.execute();
	}
}
