package headfirst.command.party;

/**
 * 何もしないCommand
 */
public class NoCommand implements Command {
	public void execute() { }
	public void undo() { }
}
