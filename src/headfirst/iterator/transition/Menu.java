package headfirst.iterator.transition;

import headfirst.iterator.dinermergeri.MenuItem;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
