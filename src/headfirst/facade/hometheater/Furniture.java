package headfirst.facade.hometheater;

/**
 * 家具クラス
 */
public class Furniture {
	protected String description;//名前
	
	public Furniture(String description) {
		this.description = description;
	}
	
	/**
	 * 家具の名前を返す
	 */
	public String toString() {
        return description;
    }
}
