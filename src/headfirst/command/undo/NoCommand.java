package headfirst.command.undo;

/**
 * 何もしないCommand
 */
public class NoCommand implements Command {
	public void execute() { }
	public void undo() { }
}
