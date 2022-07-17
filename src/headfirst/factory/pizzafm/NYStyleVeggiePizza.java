package headfirst.factory.pizzafm;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		name = "ニューヨークスタイル野菜ピザ";
		dough = "薄いクラスト生地";
		sauce = "マリナラソース";
 
		toppings.add("レッジャーノ");
		toppings.add("にんにく");
		toppings.add("たまねぎ");
		toppings.add("マッシュルーム");
		toppings.add("赤唐辛子");
	}
}
