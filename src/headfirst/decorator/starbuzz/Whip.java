package headfirst.decorator.starbuzz;
 
/**
 * ホイップクリーム入り飲み物
 */
public class Whip extends CondimentDecorator {
 
	public Whip(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return beverage.getDescription() + "、ホイップ";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
