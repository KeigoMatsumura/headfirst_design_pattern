package headfirst.command.party;

/**
 * お風呂をオンにするCommand
 */
public class HottubOnCommand implements Command {
	private Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	
	/**
	 * 湯沸かしをオンにし、温度を45度に設定し、お湯を循環させる
	 */
	public void execute() {
		hottub.on();
		hottub.setTemperature(45);
		hottub.circulate();
	}
	
	/**
	 * オフに戻す
	 */
	public void undo() {
		hottub.off();
	}
}
