package headfirst.factory.pizzafm;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		name = "シカゴスタイルペパロニピザ";
		dough = "極厚クラスト生地";
		sauce = "プラムトマトソース";
 
		toppings.add("刻んだモツァレラチーズ");
		toppings.add("ブラックオリーブ");
		toppings.add("ほうれん草");
		toppings.add("ナス");
		toppings.add("スライスペパロニ");
	}
 
	public void cut() {
		System.out.println("ピザを扇形に切り分ける");
	}
}
