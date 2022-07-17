package headfirst.factory.pizzaaf;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("チーズ");
		System.out.println("イーサンが" + pizza + "を注文\n");
 
		pizza = chicagoStore.orderPizza("チーズ");
		System.out.println("ジョエルが" + pizza + "を注文\n");

		pizza = nyStore.orderPizza("クラム");
		System.out.println("イーサンが" + pizza + "を注文\n");
 
		pizza = chicagoStore.orderPizza("クラム");
		System.out.println("ジョエルが" + pizza + "を注文\n");

		pizza = nyStore.orderPizza("ペパロニ");
		System.out.println("イーサンが" + pizza + "を注文\n");
 
		pizza = chicagoStore.orderPizza("ペパロニ");
		System.out.println("ジョエルが" + pizza + "を注文\n");

		pizza = nyStore.orderPizza("野菜");
		System.out.println("イーサンが" + pizza + "を注文\n");
 
		pizza = chicagoStore.orderPizza("野菜");
		System.out.println("ジョエルが" + pizza + "を注文\n");
	}
}
