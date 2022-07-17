package headfirst.decorator.starbuzz;

/**
 * 豆乳入り飲み物
 */
public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + "、豆乳";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
