package headfirst.facade.hometheater;

/**
 * スクリーン
 */
public class Screen extends Furniture {
	
	public Screen(String description) {
		super(description);
	}
 
	/**
	 * スクリーンを上げる
	 */
	public void up() {
		System.out.println(description + "を上げます");
	}
 
	/**
	 * スクリーンを下げる
	 */
	public void down() {
		System.out.println(description + "を下ろします");
	}
}
