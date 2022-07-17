package headfirst.command.party;

import java.util.*;

/**
 * 複数のCommandを一度に行う
 */
public class MacroCommand implements Command {
	private List<Command> commands;//行うべきCommandのList
 
	public MacroCommand(List<Command> commands) {
		this.commands = commands;
	}

	/**
	 * 複数のCommandをまとめて実行
	 * 明示的に最初のCommandから順に実行するので、拡張forを使っていない
	 */
	public void execute() {
		for (int i = 0; i< commands.size(); i++) {
			commands.get(i).execute();
		}
	}
 
	/**
	 * undoを行う
	 * execute とは逆の順序で各Commandに対するundoを行うので、Listの最後からundo
	 */
	public void undo() {

		for (int i = commands.size() -1; i >= 0; i--) {
			commands.get(i).undo();
		}
	}
}

