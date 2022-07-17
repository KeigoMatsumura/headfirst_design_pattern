package headfirst.decorator.starbuzz;

/**
 * オプション付きの飲み物
 */
public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;//オプションを入れる飲み物
	
	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	public abstract String getDescription();//オプション付きの飲み物の名前を得る
}
