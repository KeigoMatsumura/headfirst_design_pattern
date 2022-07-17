package headfirst.factory.pizzafm;

public class DependentPizzaStore {
 
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("ニューヨーク")) {
			if (type.equals("チーズ")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("野菜")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("クラム")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("ペパロニ")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("シカゴ")) {
			if (type.equals("チーズ")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("野菜")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("クラム")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("ペパロニ")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("エラー：無効なピザの種類");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
