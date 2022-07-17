package headfirst.facade.hometheater;

/**
 * ホームシアター
 */
public class HomeTheaterFacade {
	private Amplifier amp;//アンプ
	private Tuner tuner;//チューナー
	private DvdPlayer dvd;//DVDプレーヤー
	private CdPlayer cd;//CDプレーヤー
	private Projector projector;//プロジェクター
	private TheaterLights lights;//照明
	private Screen screen;//スクリーン
	private PopcornPopper popper;//ポップコーンポッパー
 
	public HomeTheaterFacade(Amplifier amp, 
				 Tuner tuner, 
				 DvdPlayer dvd, 
				 CdPlayer cd, 
				 Projector projector, 
				 Screen screen,
				 TheaterLights lights,
				 PopcornPopper popper) {
 
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}
 
	/**
	 * 映画を見る
	 * @param movie 映画
	 */
	public void watchMovie(String movie) {
		System.out.println("映画を見る準備をします...");
		popper.on();//ポップコーン製造機のスイッチオン
		popper.pop();//ポップコーンを作り
		lights.dim(10);//照明を10%に落とし
		screen.down();//スクリーンを降ろし
		projector.on();//プロジェクターのスイッチを入れ
		projector.wideScreenMode();//プロジェクターをワイドスクリーンモードにし
		amp.on();//アンプのスイッチを入れ
		amp.setDvd(dvd);//DVDプレーヤーに接続し
		amp.setSurroundSound();//サラウンドサウンドにし
		amp.setVolume(5);//ボリュームを5に設定し
		dvd.on();//DVDプレーヤーのスイッチを入れ
		dvd.play(movie);//映画を再生する
	}
 
	/**
	 * 映画鑑賞の終了
	 */
	public void endMovie() {
		System.out.println("映画鑑賞を終了します...");
		popper.off();//ポップコーンポッパーのスイッチを切り
		lights.on();//照明をつけ
		screen.up();//スクリーンを上げ
		projector.off();//プロジェクターのスイッチを切り
		amp.off();//アンプのスイッチを切り
		dvd.stop();//DVDプレーヤーを止め
		dvd.eject();//DVDをエジェクトし
		dvd.off();//DVDプレーヤーのスイッチを切る
	}

	public void listenToCd(String cdTitle) {
		System.out.println("音楽鑑賞の準備をします...");
		lights.on();
		amp.on();
		amp.setVolume(5);
		amp.setCd(cd);
		amp.setStereoSound();
		cd.on();
		cd.play(cdTitle);
	}

	public void endCd() {
		System.out.println("音楽鑑賞を終わります...");
		amp.off();
		amp.setCd(cd);
		cd.eject();
		cd.off();
	}

	public void listenToRadio(double frequency) {
		System.out.println("ラジオを聞きます...");
		tuner.on();
		tuner.setFrequency(frequency);
		amp.on();
		amp.setVolume(5);
		amp.setTuner(tuner);
	}

	public void endRadio() {
		System.out.println("ラジオを聞くのをやめます...");
		tuner.off();
		amp.off();
	}
}
