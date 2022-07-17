package headfirst.command.remote;

/**
 * ステレオクラス
 */
public class Stereo {
	private String location;//設置場所

	public Stereo(String location) {
		this.location = location;
	}

    /**
     * ステレオをオンにする
     */
	public void on() {
		System.out.println(location + "のステレオをオンにします");
	}

    /**
     * ステレオをオフにする
     */
	public void off() {
		System.out.println(location + "のステレオをオフにします");
	}

    /**
     * CD再生モードにする
     */
	public void setCD() {
		System.out.println(location + "のステレオをCD再生モードにします");
	}

    /**
     * DVD再生モードにする
     */
	public void setDVD() {
		System.out.println(location + "のステレオをDVD再生モードにします");
	}

    /**
     * ラジオモードにする
     */
	public void setRadio() {
		System.out.println(location + "のステレオをラジオモードにします");
	}

    /**
     * ボリュームを設定する
     * @param volume ボリューム
     */
	public void setVolume(int volume) {
		// code to set the volume
		// valid range: 1-11 (after all 11 is better than 10, right?)
		System.out.println(location + "のステレオのボリュームを" + volume + "にします");
	}
}
