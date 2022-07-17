package headfirst.adapter.iterenum;

import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		//引数を要素とする ArrayList を生成
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(args));
		//Enumeration へのアダプト
		Enumeration<String> enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
