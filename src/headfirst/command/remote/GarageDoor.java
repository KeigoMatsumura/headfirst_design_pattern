package headfirst.command.remote;

/**
 * ガレージクラス
 */
public class GarageDoor {
	private String location;//設置場所

	public GarageDoor(String location) {
		this.location = location;
	}

	/*
	 * シャッターを上げる
	 */
	public void up() {
		System.out.println(location + "のガレージのシャッターを上げます");
	}

	/**
	 * シャッターを下げる
	 */
	public void down() {
		System.out.println(location + "のガレージのシャッターを下げます");
	}

	/**
	 * シャッターを止める
	 */
	public void stop() {
		System.out.println(location + "のガレージのシャッターを止めます");
	}

	/**
	 * 照明をつける
	 */
	public void lightOn() {
		System.out.println(location + "のガレージの照明をつけます");
	}

	/**
	 * 照明を消す
	 */
	public void lightOff() {
		System.out.println(location + "のガレージの照明を消します");
	}
}
