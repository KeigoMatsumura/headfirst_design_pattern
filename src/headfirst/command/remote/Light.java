package headfirst.command.remote;

/**
 * 照明クラス
 */
public class Light {
	private String location;//照明の場所

	public Light(String location) {
		this.location = location;
	}

	/**
	 * 照明をつける
	 */
	public void on() {
		System.out.println(location + "の照明をつけます");
	}

	/**
	 * 照明を消す
	 */
	public void off() {
		System.out.println(location + "の照明を消します");
	}
}
