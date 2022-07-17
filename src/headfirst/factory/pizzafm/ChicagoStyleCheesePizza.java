package headfirst.factory.pizzafm;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "シカゴスタイルのディープディッシュチーズピザ";
		dough = "極厚クラスト生地";
		sauce = "プラムトマトソース";
 
		toppings.add("刻んだモツァレラチーズ");
	}
 
	public void cut() {
		System.out.println("ピザを扇形に切り分ける");
	}
}
