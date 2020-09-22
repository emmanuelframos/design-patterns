package br.com.chainofresponsibility.core;

import br.com.chainofresponsibility.Order;

public class DiscountPerItem extends Middleware {

    @Override
    public void apply(Order order) {
        if (order.getItems().size() > 10) {
            System.out.println("Giving discount per item.");
        }else {
            System.out.println("Skipping discount per item.");
        }

        this.applyNext(order);
    }
}