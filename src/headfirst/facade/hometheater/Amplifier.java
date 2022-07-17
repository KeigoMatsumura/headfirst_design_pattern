package headfirst.facade.hometheater;

/**
 * アンプ
 */
public class Amplifier extends HomeElectronics {
	private Tuner tuner;
	private DvdPlayer dvd;
	private CdPlayer cd;

	public Amplifier(String description) {
		super(description);
	}
 
	/**
	 * ステレオモードにする
	 */
	public void setStereoSound() {
		System.out.println(description + "をステレオモードに設定");
	}
 
	/**
	 * サラウンドモードにする
	 */
	public void setSurroundSound() {
		System.out.println(description + "のサラウンド音声スイッチオン（5スピーカ、1サブウーファ）");
	}
 
	/**
	 * ボリュームの設定
	 * @param level ボリュームレベル
	 */
	public void setVolume(int level) {
		System.out.println(description + "のボリュームを" + level + "に設定");
	}

	/**
	 * チューナーの接続
	 * @param tuner チューナー
	 */
	public void setTuner(Tuner tuner) {
		System.out.println(description + "を" + tuner + "に接続");
		this.tuner = tuner;
	}
	
	public Tuner getTuner() {
		return tuner;
	}
  
	/**
	 * DVDプレーヤーの接続
	 * @param dvd DVDプレーヤー
	 */
	public void setDvd(DvdPlayer dvd) {
		System.out.println(description + "を" + dvd + "に接続");
		this.dvd = dvd;
	}

	public DvdPlayer getDvd() {
		return dvd;
	}
	
	/**
	 * CDプレーヤーの接続
	 * @param cd CDプレーヤー
	 */
	public void setCd(CdPlayer cd) {
		System.out.println(description + "を" + cd + "に接続");
		this.cd = cd;
	}
	
	public CdPlayer getCd() {
		return cd;
	}
}
