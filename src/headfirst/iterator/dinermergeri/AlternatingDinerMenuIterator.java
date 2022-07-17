package headfirst.iterator.dinermergeri;

import headfirst.iterator.dinermergercafe.MenuItem;

import java.util.Iterator;
import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
	private MenuItem[] items;
	private int position;

	public AlternatingDinerMenuIterator(MenuItem[] items) {
		this.items = items;
		position = Calendar.DAY_OF_WEEK % 2;
	}
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public void remove() {
		throw new UnsupportedOperationException(
			"隔日夕食メニューイタレーターはremove()をサポートしていません");
	}
}
