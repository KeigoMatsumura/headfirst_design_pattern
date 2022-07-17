package headfirst.adapter.iterenum;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
		//引数を要素とする Vector を生成
		Vector<String> v = new Vector<String>(Arrays.asList(args));
		//Iterator へのアダプト
		Iterator<String> iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
