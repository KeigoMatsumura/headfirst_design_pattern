package headfirst.command.simpleremote;

/**
 * 照明クラス
 */
public class Light {

	public Light() {
	}

	/**
	 * 照明オン
	 */
	public void on() {
		System.out.println("照明をつけます");
	}

	/**
	 * 照明オフ
	 */
	public void off() {
		System.out.println("照明を消します");
	}
}
