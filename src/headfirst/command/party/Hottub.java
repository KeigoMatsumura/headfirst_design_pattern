package headfirst.command.party;

/**
 * お風呂クラス
 */
public class Hottub {
	private boolean on;//湯沸かしスイッチのオンオフ
	private int temperature;//温度

	public Hottub() {
		temperature = 40;//デフォルト温度は40度
	}

	/**
	 * 湯沸かしオン
	 */
	public void on() {
		on = true;
	}

	/**
	 * 湯沸かしオフ
	 */
	public void off() {
		on = false;
	}

	/**
	 * お湯を混ぜる
	 */
	public void circulate() {
		if (on) {
			System.out.println("お風呂のお湯を循環させます");
		}
	}

	/**
	 * ジェット水流にする
	 */
	public void jetsOn() {
		if (on) {
			System.out.println("お風呂のジェット水流をオンにします");
		}
	}

	/**
	 * ジェット水流を止める
	 */
	public void jetsOff() {
		if (on) {
			System.out.println("お風呂のジェット水流を止めます");
		}
	}

	/**
	 * 温度設定をする
	 * @param temperature 設定する温度
	 */
	public void setTemperature(int temperature) {
		if (temperature > this.temperature) {
			System.out.println("お風呂の温度を" + temperature + "度に上げます");
		}
		else {
			System.out.println("お風呂の温度を" + temperature + "度に下げます");
		}
		this.temperature = temperature;
	}
	
	/**
	 * @return temperature のゲッター
	 */
	public int getTemperature() {
		return temperature;
	}
}
