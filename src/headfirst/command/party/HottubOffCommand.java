package headfirst.command.party;

/**
 * お風呂をオフにするCommand
 */
public class HottubOffCommand implements Command {
	private Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	/**
	 * 温度を49度に設定してオフにする
	 */
	public void execute() {
		hottub.setTemperature(40);
		hottub.off();
	}
	
	/**
	 * オンに戻す
	 */
	public void undo() {
		hottub.on();
	}
}
