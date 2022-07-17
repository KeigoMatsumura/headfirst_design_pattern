package headfirst.factory.pizzaaf;

import java.util.*;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public List<Veggies> createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
