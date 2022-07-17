package headfirst.facade.hometheater;


/**
 * DVDプレーヤー
 */
public class DvdPlayer extends HomeElectronics {
	private int currentTrack;
	private Amplifier amplifier;
	private String movie;

	public DvdPlayer(String description, Amplifier amplifier) {
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
		movie = null;
		System.out.println(description + "から取り出し");
	}
	
	/**
	 * DVD再生
	 * @param title 再生するDVDのタイトル
	 */
	public void play(String movie) {
		this.movie = movie;
		currentTrack = 0;
		System.out.println(description + "は\"" + movie + "\"を再生");
	}

	/**
	 * 指定トラックを再生
	 * @param track　トラック
	 */
	public void play(int track) {
		if (movie == null) {
			System.out.println(description + "にDVDがセットされていないので、トラック"
					+ track	+ "を再生できません");
		} else {
			currentTrack = track;
			System.out.println(description + "はトラック" + currentTrack + "を再生");
		}
	}

	public void stop() {
		currentTrack = 0;
		System.out.println(description + "は映画「" + movie + "」の再生を停止");
	}

	public void pause() {
		System.out.println(description + "は映画「" + movie + "」の再生を一時停止");
	}

	/**
	 * 2チャンネルに設定
	 */
	public void setTwoChannelAudio() {
		System.out.println(description + "を2チャンネルに設定");
	}

	/**
	 * サラウンドに設定
	 */
	public void setSurroundAudio() {
		System.out.println(description + "をサラウンドに設定");
	}
}
