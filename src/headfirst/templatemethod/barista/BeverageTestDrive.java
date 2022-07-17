package headfirst.templatemethod.barista;

public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\n紅茶を作っています...");
		tea.prepareRecipe();
 
		System.out.println("\nコーヒーを作っています...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\n紅茶を作っています...");
		teaHook.prepareRecipe();
 
		System.out.println("\nコーヒーを作っています...");
		coffeeHook.prepareRecipe();
	}
}
