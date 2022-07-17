package headfirst.factory.pizzaaf;

import java.util.*;

public abstract class Pizza {
	protected String name;

	protected Dough dough;
	protected Sauce sauce;
	protected List<Veggies> veggies;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;

	abstract void prepare();

	public void bake() {
		System.out.println("350度で25分焼く");
	}

	public void cut() {
		System.out.println("ピザを扇形に切り分ける");
	}

	public void box() {
		System.out.println("PizzaStoreの正式な箱にピザを入れる");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(name);
		if (dough != null) {
			result.append("、" + dough);
		}
		if (sauce != null) {
			result.append("、" + sauce);
		}
		if (cheese != null) {
			result.append("、" + cheese);
		}
		if (veggies != null) {
			for (Veggies vegitable: veggies) {
				result.append("、");
				result.append(vegitable);
			}
		}
		if (clam != null) {
			result.append("、" + clam);
		}
		if (pepperoni != null) {
			result.append("、" + pepperoni);
		}
		return result.toString();
	}
}
