package headfirst.command.remote;

import java.util.*;

/**
 * リモコンクラス
 */
public class RemoteControl {
	private final int NUMBEROFBUTTON = 7;//リモコンで操作する機器の数
	private List<Slot> slots;

    /**
     * 一つの機器に対応するオンとオフのCommandのセット(slot)を表すprivateクラス
     */
	private class Slot {
		private Command onCommand;
		private Command offCommand;
		
		public Slot(Command onCommand, Command offCommand) {
			this.onCommand = onCommand;
			this.offCommand = offCommand;
		}
		
		public Command getOnCommand() {
			return onCommand;
		}
		
		public Command getOffCommand() {
			return offCommand;
		}
	}

	public RemoteControl() {
        //オンオフのCommandペアのList
		slots = new ArrayList<Slot>(NUMBEROFBUTTON);
		 
		Command noCommand = new NoCommand();//何もしないCommandを生成
		for(int i=0;i<NUMBEROFBUTTON;i++) {
            //オンオフともに何もしないセットを生成
			Slot onOffCommand = new Slot(noCommand, noCommand);
			slots.add(onOffCommand);//それをListに追加
		}
	}
  
    /**
     * slot番目のオンオフセットにonCommandとoffComanndをセット
     * @param slot
     * @param onCommand
     * @param offCommand
     */
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		Slot onOffCommand = new Slot(onCommand, offCommand);
		slots.set(slot, onOffCommand);
	}
 
    /**
     * slot番目のオンボタンが押されたときの処理
     * @param slot
     */
	public void onButtonWasPushed(int slot) {
		slots.get(slot).getOnCommand().execute();
	}
 
    /**
     * slot番目のオフボタンが押されたときの処理
     * @param slot
     */
	public void offButtonWasPushed(int slot) {
		slots.get(slot).getOffCommand().execute();
	}
 
    /**
     * 各ボタンが何をするのかを表す文字列を生成して返す
     */
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ リモコン -------\n");
		for (int i = 0; i < slots.size(); i++) {
			stringBuff.append("[スロット " + i + "] " + slots.get(i).getOnCommand().getClass().getName()
				+ "    " + slots.get(i).getOffCommand().getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
