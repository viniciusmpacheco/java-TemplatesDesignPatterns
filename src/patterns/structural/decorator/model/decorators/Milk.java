package patterns.structural.decorator.model.decorators;

import patterns.structural.decorator.model.Drink;

public class Milk extends DrinkDecorator {
	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		System.out.println("- Adding 30ml of Milk");
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() + 0.5d;
	}
}
