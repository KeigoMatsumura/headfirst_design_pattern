package headfirst.iterator.dinermerger;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
	private ArrayList<MenuItem> items;
	private int position = 0;
 
	public ArrayListIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
 
	public MenuItem next() {
		MenuItem object = items.get(position);
		position = position + 1;
		return object;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
