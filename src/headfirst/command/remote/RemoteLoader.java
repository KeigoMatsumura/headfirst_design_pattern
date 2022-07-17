package headfirst.command.remote;

public class RemoteLoader {
 
	public static void main(String[] args) {
		//リモコンを生成
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("リビングルーム");//照明(リビング)を生成
		Light kitchenLight = new Light("キッチン");//照明(台所)を生成
		CeilingFan ceilingFan= new CeilingFan("リビングルーム");//扇風機を生成
		GarageDoor garageDoor = new GarageDoor("");//ガレージを生成
		Stereo stereo = new Stereo("リビングルーム");//ステレオを生成
  
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);//照明(リビング)オンCommand
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);//照明(リビング)オフCommand
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);//照明(台所)オンCommand
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);//照明(台所)オフCommand
  
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);//扇風機オンCommand
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);//扇風機オフCommand
 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);//ガレージシャッターを上げるCommand
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);//ガレージシャッターを下げるCommand
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);//ステレオをCDモードでオンにするCommand
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);//ステレオをオフにするCommand
 
		//slot0に照明(リビング)を割り当てる
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		//slot1に照明(台所)を割り当てる
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		//slot2に扇風機を割り当てる
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		//slot3にステレオを割り当てる
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);//0ボタンオン
		remoteControl.offButtonWasPushed(0);//0ボタンオフ
		remoteControl.onButtonWasPushed(1);//1ボタンオン
		remoteControl.offButtonWasPushed(1);//1ボタンオフ
		remoteControl.onButtonWasPushed(2);//2ボタンオン
		remoteControl.offButtonWasPushed(2);//2ボタンオフ
		remoteControl.onButtonWasPushed(3);//3ボタンオン
		remoteControl.offButtonWasPushed(3);//3ボタンオフ
	}
}
