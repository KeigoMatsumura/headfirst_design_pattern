package headfirst.command.remote;

/**
 * お風呂をオンにするCommand
 */
public class HottubOnCommand implements Command {
	private Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

    /**
     * スイッチをオンにし、温度を高温に設定して、お湯を混ぜオン
     */
	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
