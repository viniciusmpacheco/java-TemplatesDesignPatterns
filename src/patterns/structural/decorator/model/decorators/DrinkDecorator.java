package patterns.structural.decorator.model.decorators;

import patterns.structural.decorator.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}
