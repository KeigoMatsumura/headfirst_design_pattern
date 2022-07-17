package headfirst.decorator.starbuzz;

/**
 * モカ入り飲み物
 */
public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return beverage.getDescription() + "、モカ";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
