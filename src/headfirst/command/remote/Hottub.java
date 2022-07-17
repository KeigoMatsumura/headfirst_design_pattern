package headfirst.command.remote;

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
     * 湯沸かしスイッチオン
     */
	public void on() {
		on = true;
	}

    /**
     * 湯沸かしスイッチオフ
     */
	public void off() {
		on = false;
	}

    /**
     * お湯を混ぜオン
     * スイッチがオフなら何もしない
     */
	public void bubblesOn() {
		if (on) {
			System.out.println("お風呂のお湯を循環させます");
		}
	}

    /**
     * お湯を混ぜオフ
     * スイッチがオフなら何もしない
     */
	public void bubblesOff() {
		if (on) {
			System.out.println("お風呂のお湯の循環を止めます");
		}
	}

    /**
     * ジェット水流にする
     * スイッチがオフなら何もしない
     */
	public void jetsOn() {
		if (on) {
			System.out.println("お風呂のジェット水流をオンにします");
		}
	}

    /**
     * ジェット水流を止める
     * スイッチがオフなら何もしない
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
		this.temperature = temperature;
	}

	/**
	 * 高温(45度)モードにする
	 */
	public void heat() {
		temperature = 45;
		System.out.println("お風呂の温度設定を45度にします");
	}

	/**
	 * 低温(40度)モードにする
	 */
	public void cool() {
		temperature = 40;
		System.out.println("お風呂の温度設定を40度にします");
	}
	
    /**
     * @return temperature のゲッター
     */
	public int getTemperature() {
		return temperature;
	}
}
