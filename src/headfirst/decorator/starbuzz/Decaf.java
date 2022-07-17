package headfirst.decorator.starbuzz;

/**
 * カフェイン抜きコーヒー
 */
public class Decaf extends Beverage {
	public Decaf() {
		description = "カフェイン抜き";
	}
 
	public double cost() {
		return 1.05;
	}
}

