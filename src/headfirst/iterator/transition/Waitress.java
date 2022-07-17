package headfirst.iterator.transition;
import headfirst.iterator.dinermergeri.MenuItem;

import java.util.*;
  
     
public class Waitress {
	private ArrayList<MenuItem> menus;
     
  
	public Waitress(ArrayList<MenuItem> menus) {
		this.menus = menus;
	}
   
	public void printMenu() {
		Iterator<MenuItem> menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.createIterator());
		}
	}
   
	void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}  
