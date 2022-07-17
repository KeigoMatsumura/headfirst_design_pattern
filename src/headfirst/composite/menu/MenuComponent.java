package headfirst.composite.menu;

/**
 * メニューに対するデフォルト動作の実装
 */
public class MenuComponent {
   
	/**
	 * メニューの追加
	 * @param menuComponent 追加するメニュー
	 */
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * メニューの削除
	 */
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * i 番目のサブメニューの取得
	 * @param i
	 * @return サブメニュー
	 */
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
 
	/**
	 * メニュー名の取得
	 * @return　メニュー名
	 */
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * メニューに対する記述の取得
	 * @return メニューに対する記述
	 */
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 値段の取得
	 * @return 値段
	 */
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 菜食主義者用か？
	 * @return yes/no
	 */
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	/**
	 * メニューの表示
	 */
	public void print() {
		throw new UnsupportedOperationException();
	}
}
