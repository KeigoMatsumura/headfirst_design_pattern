package headfirst.factory.pizzafm;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
		name = "ニューヨークスタイルペパロニピザ";
		dough = "薄いクラスト生地";
		sauce = "マリナラソース";
 
		toppings.add("レッジャーノ");
		toppings.add("スライスペパロニ");
		toppings.add("にんにく");
		toppings.add("たまねぎ");
		toppings.add("マッシュルーム");
		toppings.add("赤唐辛子");
	}
}
