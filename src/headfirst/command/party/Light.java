package headfirst.command.party;

/**
 * 照明クラス
 */
public class Light {
	private String location;//照明の場所
	private int level;//明るさ(%)

	public Light(String location) {
		this.location = location;
	}

	/**
	 * 明るさを100%にしてスイッチオン
	 */
	public void on() {
		level = 100;
		System.out.println(location + "の照明をつけます");
	}

	/**
	 * 明るさを0にする（オフにする）
	 */
	public void off() {
		level = 0;
		System.out.println(location + "の照明を消します");
	}

	/**
	 * 明るさを指定された%にする
	 * @param level 明るさ
	 */
	public void dim(int level) {
		this.level = level;
		if (level == 0) {//明るさ0なので、オフ
			off();
		}
		else {
			System.out.println(location + "の照明の明るさを" + level + "%にします");
		}
	}

	/**
	 * @return level のゲッター
	 */
	public int getLevel() {
		return level;
	}
}
