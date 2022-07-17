package headfirst.command.party;

/**
 * テレビクラス
 */
public class TV {
	private String location;//設置場所
	private int channel;//現在のチャンネル

	public TV(String location) {
		this.location = location;
	}

	/**
	 * テレビオン
	 */
	public void on() {
		System.out.println(location + "のテレビをつけます");
	}

	/**
	 * テレビオフ
	 */
	public void off() {
		System.out.println(location + "のテレビを消します");
	}

	/**
	 * チャンネルを設定（ここでは3チャンネル固定）
	 */
	public void setInputChannel() {
		this.channel = 3;
		System.out.println(location + "のテレビのチャンネルをDVD用に設定します");
	}
	
	/**
	 * channel のゲッター
	 * @return channel
	 */
	public int getChannel() {
		return channel;
	}
}
