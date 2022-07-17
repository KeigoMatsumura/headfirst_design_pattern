package headfirst.templatemethod.barista;

public class Tea extends CaffeineBeverage {
	public void brew() {
		System.out.println("紅茶を浸します");
	}
	public void addCondiments() {
		System.out.println("レモンを追加します");
	}
}
