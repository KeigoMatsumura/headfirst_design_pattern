package headfirst.templatemethod.simplebarista;

public class Coffee {
 
	public void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
 
	public void boilWater() {
		System.out.println("お湯を沸かします");
	}
 
	public void brewCoffeeGrinds() {
		System.out.println("フィルタでコーヒーをドリップします");
	}
 
	public void pourInCup() {
		System.out.println("カップに注ぎます");
	}
 
	public void addSugarAndMilk() {
		System.out.println("砂糖とミルクを加えます");
	}
}
