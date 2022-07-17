package headfirst.templatemethod.barista;

/**
 * カフェイン入り飲み物クラス（フック入り）
 */
public abstract class CaffeineBeverageWithHook {
 
	/**
	 * カフェイン入り飲み物を作る（全てのカフェイン入り飲み物で固定の手続きなのでfinal属性）
	 */
	public void prepareRecipe() {
		boilWater();//お湯を沸かす
		brew();//飲み物を作る
		pourInCup();//カップに注ぐ
		if (customerWantsCondiments()) {//条件によっては（フック）
			addCondiments();//トッピンッグを追加
		}
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

	/**
	 * トッピングをするかどうかの判定（フックのデフォルト）
	 * @return true固定
	 */
	public boolean customerWantsCondiments() {
		return true;
	}
}
