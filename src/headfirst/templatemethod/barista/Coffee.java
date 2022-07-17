package headfirst.templatemethod.barista;

public class Coffee extends CaffeineBeverage {
	public void brew() {
		System.out.println("フィルタでコーヒーをドリップします");
	}
	public void addCondiments() {
		System.out.println("砂糖とミルクを加えます");
	}
}
