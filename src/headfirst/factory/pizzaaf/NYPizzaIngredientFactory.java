package headfirst.factory.pizzaaf;

import java.util.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public List<Veggies> createVeggies() {
		List<Veggies> veggies = new ArrayList<Veggies>(Arrays.asList(new Garlic(), 
				new Onion(), new Mushroom(), new RedPepper()));
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
