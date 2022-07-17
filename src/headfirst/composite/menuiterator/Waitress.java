package headfirst.composite.menuiterator;

import java.util.Iterator;
  
public class Waitress {
	private MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
  
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();

		System.out.println("\n菜食メニュー\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = 
					(MenuComponent)iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}
}
