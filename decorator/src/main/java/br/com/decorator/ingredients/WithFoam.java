package br.com.decorator.ingredients;

import br.com.decorator.core.Coffee;

public class WithFoam extends CoffeeDecorator {

    public WithFoam(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getIngredients() {
      return super.getIngredients() + ", Foam";
    }
}