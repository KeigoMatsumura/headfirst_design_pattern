package headfirst.templatemethod.sort;

import java.util.*;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		ArrayList<Duck> ducks = new ArrayList<Duck>(
				Arrays.asList(
						new Duck("ダフィー", 8),
						new Duck("デューイ", 2),
						new Duck("ハワード", 7),
						new Duck("ルーイ", 2),
						new Duck("ドナルド", 10),
						new Duck("ヒューイ", 2)));

		System.out.println("ソート前:");
		display(ducks);

		Collections.sort(ducks);
 
		System.out.println("\nソート後:");
		display(ducks);
	}


	public static void display(ArrayList<Duck> ducks) {
		for (Duck duck: ducks) {
			System.out.println(duck);
		}
	}
}
