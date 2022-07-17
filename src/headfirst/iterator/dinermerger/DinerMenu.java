package headfirst.iterator.dinermerger;

public class DinerMenu implements Menu {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;
  
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("ベジタリアンBLT",
			"レタス、トマト、（偽）ベーコンをはさんだ全粒小麦パンサンドイッチ", true, 2.99);
		addItem("BLT",
			"レタス、トマト、ベーコンをはさんだ全粒小麦パンサンドイッチ", false, 2.99);
		addItem("本日のスープ",
			"ポテトサラダを添えた本日のスープ", false, 3.29);
		addItem("ホットドッグ",
			"サワークラウト、レリッ種、玉ねぎ、チーズをはさんだホットドッグ",
			false, 3.05);
		addItem("蒸し野菜と玄米",
			"玄米の上に蒸し野菜", true, 3.99);
		addItem("パスタ",
			"マリナラソースのかかったスパゲティとサワードパン",
			true, 3.89);
	}
  
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("すみません、メニューがいっぱいでこれ以上項目を追加できません");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
 
	// other menu methods here
}
