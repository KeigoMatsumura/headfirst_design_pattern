package headfirst.decorator.starbuzz;

/**
 * ミルク入り飲みもの
 */
public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + "、スチームミルク";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
