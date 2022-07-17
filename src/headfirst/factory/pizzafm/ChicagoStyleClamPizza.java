package headfirst.factory.pizzafm;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "シカゴスタイルクラムピザ";
		dough = "極厚クラスト生地";
		sauce = "プラムトマトソース";
 
		toppings.add("刻んだモツァレラチーズ");
		toppings.add("冷凍クラム");
	}
 
	public void cut() {
		System.out.println("ピザを扇形に切り分ける");
	}
}
