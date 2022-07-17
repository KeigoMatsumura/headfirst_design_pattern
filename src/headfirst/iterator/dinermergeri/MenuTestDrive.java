package headfirst.iterator.dinermergeri;

public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
		waitress.printVegetarianMenu();

		System.out.println("\n客がホットドッグは菜食者用かと聞きました");
		System.out.print("ウェイトレスは: ");
		if (waitress.isItemVegetarian("Hotdog")) {
			System.out.print("「はい」");
		} else {
			System.out.print("「いいえ」");
		}
		System.out.println("と答えました");
		System.out.println("\n客がワッフルは菜食者用かと聞きました");
		System.out.print("ウェイトレスは: ");
		if (waitress.isItemVegetarian("Waffles")) {
			System.out.print("「はい」");
		} else {
			System.out.print("「いいえ」");
		}
		System.out.println("と答えました");

	}
}
