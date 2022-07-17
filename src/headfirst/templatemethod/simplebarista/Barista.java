package headfirst.templatemethod.simplebarista;

public class Barista {
 
	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		System.out.println("紅茶を作っています...");
		tea.prepareRecipe();
		System.out.println("コーヒーを作っています...");
		coffee.prepareRecipe();
	}
}
