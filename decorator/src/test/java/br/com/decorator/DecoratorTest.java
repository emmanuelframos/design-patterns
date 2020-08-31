package br.com.decorator;

import br.com.decorator.core.Coffee;
import br.com.decorator.core.SimpleCoffee;
import br.com.decorator.ingredients.WithFoam;
import br.com.decorator.ingredients.WithMilk;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test_decorator(){
        Coffee latte = prepareLatte();
        System.out.println("## Latte Coffee ##");
        display(latte);

        Coffee cappuccino = prepareCapuccino();
        System.out.println("## Cappuccino Coffee ##");
        display(cappuccino);
    }

    private Coffee prepareCapuccino(){
        return new WithFoam(new WithMilk(new SimpleCoffee()));
    }

    private Coffee prepareLatte(){
        return new WithMilk(new SimpleCoffee());
    }

    private void display(Coffee coffee){
        System.out.println("Price: " + coffee.getCost());
        System.out.println("Ingredients: " + coffee.getIngredients());
        System.out.println();
    }
}