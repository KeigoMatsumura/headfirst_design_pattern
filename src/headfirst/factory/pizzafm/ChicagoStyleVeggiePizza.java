package headfirst.factory.pizzafm;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "シカゴスタイル野菜ピザ";
		dough = "極厚クラスト生地";
		sauce = "プラムトマトソース";
 
		toppings.add("刻んだモツァレラチーズ");
		toppings.add("ブラックオリーブ");
		toppings.add("ほうれん草");
		toppings.add("ナス");
	}
 
	public void cut() {
		System.out.println("ピザを扇形に切り分ける");
	}
}
