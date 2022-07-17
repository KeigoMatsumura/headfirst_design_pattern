package headfirst.adapter.iterenum;

import java.util.*;

/**
 * EnumerationをIteratorにアダプトさせる(継承を利用)
 */
public class EnumerationIterator implements Iterator<String> {
	private Enumeration<String> enumeration;//アダプティー
 
	public EnumerationIterator(Enumeration<String> enumeration) {
		this.enumeration = enumeration;
	}
 
	// 以下 Iterator のインターフェースの実装
	
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}
 
	public String next() {
		return enumeration.nextElement();
	}
 
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
