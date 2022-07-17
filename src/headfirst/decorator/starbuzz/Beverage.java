package headfirst.decorator.starbuzz;

/**
 * 飲み物クラス
 */
public abstract class Beverage {
	protected String description = "飲み物名不明";//飲み物の名前
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();//飲み物の値段を得る
}
