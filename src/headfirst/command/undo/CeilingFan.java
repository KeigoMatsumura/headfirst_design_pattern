package headfirst.command.undo;

/**
 * 扇風機クラス
 */
public class CeilingFan {
	public static final int HIGH = 3;//強風
	public static final int MEDIUM = 2;//普風
	public static final int LOW = 1;//弱風
	public static final int OFF = 0;//オフ
	private String location;//設置場所
	private int speed;//現在の風の強さ
 
    /**
     * @param location　設置場所
     */
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;//最初はオフ状態
	}
  
    /**
     * 強風にする
     */
	public void high() {
		speed = HIGH;
		System.out.println(location + "の扇風機を強風にします");
	} 
 
    /**
     * 普風にする
     */
	public void medium() {
		speed = MEDIUM;
		System.out.println(location + "の扇風機を普風にします");
	}
 
    /**
     * 弱風にする
     */
	public void low() {
		speed = LOW;
		System.out.println(location + "の扇風機を弱風にします");
	}
  
    /**
     * オフにする
     */
	public void off() {
		speed = OFF;
		System.out.println(location + "の扇風機を止めます");
	}
  
    /**
     * @return 現在の風の強さ
     */
	public int getSpeed() {
		return speed;
	}
}
