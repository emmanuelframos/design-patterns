package br.com.decorator.core;

public class SimpleCoffee implements Coffee {

    @Override
    public Double getCost() {
        return 1d;
    }

    @Override
    public String getIngredients() {
       return "Coffee";
    }

}
