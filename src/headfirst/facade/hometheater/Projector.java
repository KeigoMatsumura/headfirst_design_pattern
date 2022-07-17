package headfirst.facade.hometheater;

/**
 * プロジェクター
 */
public class Projector extends HomeElectronics {
	private DvdPlayer dvdPlayer;//接続するDVDプレーヤー
	
	public Projector(String description, DvdPlayer dvdPlayer) {
		super(description);
		this.dvdPlayer = dvdPlayer;
	}
	
	public DvdPlayer getDvdPlayer() {
		return dvdPlayer;
	}

	/**
	 * ワイドスクリーンモードにする
	 */
	public void wideScreenMode() {
		System.out.println(description + "はワイドスクリーンモード(縦横比16x9)です");
	}

	/**
	 * テレビモードにする
	 */
	public void tvMode() {
		System.out.println(description + "はテレビモード(縦横比4x3)です");
	}
}
