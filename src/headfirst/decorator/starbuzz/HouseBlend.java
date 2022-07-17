package headfirst.decorator.starbuzz;

/**
 * ブレンドコーヒー
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "ハウスブレンド";
	}
 
	public double cost() {
		return .89;
	}
}

