package headfirst.iterator.dinermergercafe;

import java.util.*;

public class CafeMenu implements Menu {
	private Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();
  
	public CafeMenu() {
		addItem("野菜バーガーとフライドポテト",
			"全粒小麦パンにレタスとトマトをはさんだ野菜バーガーとフライドポテト",
			true, 3.99);
		addItem("本日のスープ",
			"サラダが付いた本日のスープ",
			false, 3.69);
		addItem("ブリトー",
			"インゲン豆、サルサ、グアカモーレ入りの大きなブリトー",
			true, 4.29);
	}
 
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
 
	public Hashtable<String, MenuItem> getItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}
