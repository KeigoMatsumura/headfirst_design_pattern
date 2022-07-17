package headfirst.factory.pizzafm;

import java.util.*;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected List<String> toppings = new ArrayList<String>();
 
	void prepare() {
		System.out.println(name + "を下処理");
		System.out.println("生地をこねる...");
		System.out.println("ソースを追加...");
		System.out.println("トッピングを追加: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}
  
	void bake() {
		System.out.println("350度で25分焼く");
	}
 
	void cut() {
		System.out.println("ピザを扇形に切り分ける");
	}
  
	void box() {
		System.out.println("PizzaStoreの正式な箱にピザを入れる");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping: toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}

 
 
