package headfirst.adapter.iterenum;

import java.util.*;

/**
 * IteratorをEnumerationにアダプトさせる(継承を利用)
 */
public class IteratorEnumeration implements Enumeration<String> {
	private Iterator<String> iterator;//アダプティー
 
	public IteratorEnumeration(Iterator<String> iterator) {
		this.iterator = iterator;
	}
	
	// 以下 Enumeration のインターフェースの実装
 
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
 
	public String nextElement() {
		return iterator.next();
	}
}
