package headfirst.iterator.dinermergeri;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	private ArrayList<MenuItem> menuItems;
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("K&Bのパンケーキ朝食", 
			"スクランブルエッグとトーストが付いたパンケーキ", 
			true,
			2.99);
 
		addItem("通常のパンケーキ朝食", 
			"卵焼きとソーセージが付いたパンケーキ", 
			false,
			2.99);
 
		addItem("ブルーベリーパンケーキ",
			"新鮮なブルーベリーで作ったパンケーキ（ブルーベリーシロップ付き）",
			true,
			3.49);
 
		addItem("ワッフル",
			"ブルーベリーか苺の好きな方をのせたワッフル",
			true,
			3.59);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
  
	// other menu methods here
}
