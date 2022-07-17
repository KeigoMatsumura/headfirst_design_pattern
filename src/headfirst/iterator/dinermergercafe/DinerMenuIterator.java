package headfirst.iterator.dinermergercafe;
 
import java.util.Iterator;
  
public class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] list;
	int position = 0;
 
	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}
 
	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
  
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("少なくとも1回next()を実行するまでは項目を削除できません");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
}
