package headfirst.command.simpleremote;

/**
 * ガレージクラス
 */
public class GarageDoor {

	public GarageDoor() {
	}

	/**
	 * シャッターを上げる
	 */
	public void up() {
		System.out.println("ガレージのシャッターを上げます");
	}

	/**
	 * シャターを下げる
	 */
	public void down() {
		System.out.println("ガレージのシャッターを下げます");
	}

	/**
	 * シャッターを止める
	 */
	public void stop() {
		System.out.println("ガレージのシャッターを止めます");
	}

	/**
	 * 照明をつける
	 */
	public void lightOn() {
		System.out.println("Garage light is on");
	}

	/**
	 * 照明を消す
	 */
	public void lightOff() {
		System.out.println("Garage light is off");
	}
}
