package baitap.behavioural_patterns.template;

public class MargheritaPizza extends PizzaRecipe {

	@Override
	protected void addSauce() {
		System.out.println("Adding classic San Marzano tomato sauce.");
	}

	@Override
	protected void addToppings() {
		System.out.println("Adding fresh mozzarella and basil leaves.");
	}
}