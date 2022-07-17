package headfirst.command.party;

import java.util.*;

public class RemoteLoader {

	public static void main(String[] args) {

		//リモコンを生成
		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("リビングルーム");//照明を生成
		TV tv = new TV("リビングルーム");//テレビを生成
		Stereo stereo = new Stereo("リビングルーム");//ステレオを生成
		Hottub hottub = new Hottub();//お風呂を生成
 
		LightOnCommand lightOn = new LightOnCommand(light);//照明オンCommand
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);//ステレオオンCommand
		TVOnCommand tvOn = new TVOnCommand(tv);//テレビオンCommand
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);//お風呂オンCommand
		LightOffCommand lightOff = new LightOffCommand(light);//照明オフCommand
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);//ステレオフCommand
		TVOffCommand tvOff = new TVOffCommand(tv);//テレビオフCommand
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);//お風呂オフCommand

		List<Command> partyOn = new ArrayList<Command>(//全てのオンCommandのListを生成
				Arrays.asList(lightOn, stereoOn, tvOn, hottubOn));
		List<Command> partyOff = new ArrayList<Command>(//全てのオフCommandのListを生成
				Arrays.asList(lightOff, stereoOff, tvOff, hottubOff));
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);//一斉オンマクロCommand生成
		MacroCommand partyOffMacro = new MacroCommand(partyOff);//一斉オフマクロCommand生成
 
		//リモコンの1番ボタンセット（オンオフのセット）に一斉オンオフを設定
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- 一斉オンボタンを押します---");
		remoteControl.onButtonWasPushed(0);//一斉オンボタンを押す
		System.out.println("--- 一斉オフボタンを押します---");
		remoteControl.offButtonWasPushed(0);//一斉オフボタンを押す
	}
}
