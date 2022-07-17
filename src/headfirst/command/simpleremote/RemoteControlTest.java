package headfirst.command.simpleremote;

public class RemoteControlTest {
	public static void main(String[] args) {
		//リモコンを生成
		SimpleRemoteControl remote = new SimpleRemoteControl();
		//照明を生成
		Light light = new Light();
		//ガレージを生成
		GarageDoor garageDoor = new GarageDoor();
		//照明オンCommand
		LightOnCommand lightOn = new LightOnCommand(light);
		//ガレージのシャッターを上げるCommand
		GarageDoorOpenCommand garageOpen = 
		    new GarageDoorOpenCommand(garageDoor);
 
		remote.setCommand(lightOn);//照明オンCommandを設定
		remote.buttonWasPressed();//そのボタンを押す
		remote.setCommand(garageOpen);//ガレージのシャッターを上げるCommandを設定
		remote.buttonWasPressed();//そのボタンを押す
    }
}
