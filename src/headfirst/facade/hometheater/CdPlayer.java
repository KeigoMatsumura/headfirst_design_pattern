package headfirst.facade.hometheater;

/**
 * CDプレーヤー
 */
public class CdPlayer extends HomeElectronics {
	private int currentTrack;//再生中トラック
	private Amplifier amplifier;//アンプ
	private String title;//CDタイトル
	
	public CdPlayer(String description, Amplifier amplifier) {
		super(description);
		this.amplifier = amplifier;
	}
	
	public Amplifier getAmplifier() {
		return amplifier;
	}
 
	/**
	 * エジェクト
	 */
	public void eject() {
		title = null;
		System.out.println(description + "から取り出し");
	}
 
	/**
	 * CD再生
	 * @param title 再生するCDのタイトル
	 */
	public void play(String title) {
		this.title = title;
		currentTrack = 0;
		System.out.println(description + "は「" + title + "」を再生");
	}

	/**
	 * 指定トラックを再生
	 * @param track　トラック
	 */
	public void play(int track) {
		if (title == null) {//CDがセットされていない
			System.out.println(description + "にCDがセットされていないので、トラック"
					+ currentTrack + "を再生できません");
		} else {
			currentTrack = track;
			System.out.println(description + "はトラック" + currentTrack + "を再生");
		}
	}

	/**
	 * プレーヤーを停止する
	 */
	public void stop() {
		currentTrack = 0;
		System.out.println(description + "を停止");
	}
 
	/**
	 * 一時停止
	 */
	public void pause() {
		System.out.println(description + "は「" + title + "」を一時停止");
	}
}
