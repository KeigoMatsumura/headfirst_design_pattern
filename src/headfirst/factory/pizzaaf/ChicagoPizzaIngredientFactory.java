package headfirst.factory.pizzaaf;

import java.util.*;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public List<Veggies> createVeggies() {
		List<Veggies> veggies = new ArrayList<Veggies>(Arrays.asList(new BlackOlives(), new Spinach(), 
                new Eggplant()));
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
