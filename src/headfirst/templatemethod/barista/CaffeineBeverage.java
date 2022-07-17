package headfirst.templatemethod.barista;

/**
 * カフェイン入り飲み物クラス
 */
public abstract class CaffeineBeverage {
 
	/**
	 * カフェイン入り飲み物を作る（全てのカフェイン入り飲み物で固定の手続きなのでfinal属性）
	 */
	public final void prepareRecipe() {
		boilWater();//お湯を沸かす
		brew();//飲み物を作る
		pourInCup();//カップに注ぐ
		addCondiments();//トッピンッグを追加
	}
 
	/**
	 * 飲み物を作る
	 */
	public abstract void brew();
  
	/**
	 * トッピンッグを追加
	 */
	public abstract void addCondiments();
 
	/**
	 * お湯を沸かす
	 */
	public void boilWater() {
		System.out.println("お湯を沸かします");
	}
  
	/**
	 * カップに注ぐ
	 */
	public void pourInCup() {
		System.out.println("カップに注ぎます");
	}
}
