package headfirst.command.remote;

/**
 * 扇風機クラス
 */
public class CeilingFan {
    public static final int HIGH = 2;//強風
    public static final int MEDIUM = 1;//普風
    public static final int LOW = 0;//弱風
    private String location;//設置場所
    private int level;//現在の風の強さ

    /**
     * @param location　設置場所
     */
	public CeilingFan(String location) {
		this.location = location;
		level = LOW;
	}
  
    /**
     * 強風にする
     */
	public void high() {
		level = HIGH;
		System.out.println(location + "の扇風機を強風にします");
 
	} 

    /**
     * 普風にする
     */
	public void medium() {
		level = MEDIUM;
		System.out.println(location + "の扇風機を普風にします");
	}

    /**
     * 弱風にする
     */
	public void low() {
		level = LOW;
		System.out.println(location + "の扇風機を弱風にします");
	}

    /**
     * オフにする
     */
	public void off() {
		level = 0;
		System.out.println(location + "の扇風機を止めます");
	}
 
    /**
     * @return 現在の風の強さ
     */
	public int getSpeed() {
		return level;
	}
}
