package headfirst.command.remote;

/**
 * お風呂をオフにするCommand
 */
public class HottubOffCommand implements Command {
	private Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

    /**
     * 温度を低温に設定してオフにする
     */
	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
