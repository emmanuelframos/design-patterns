package br.com.decorator.ingredients;

import br.com.decorator.core.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    private final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public Double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}