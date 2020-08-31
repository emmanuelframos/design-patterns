package br.com.decorator.ingredients;

import br.com.decorator.core.Coffee;

public class WithMilk extends CoffeeDecorator {

    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}
