package br.com.chainofresponsibility.core;

import br.com.chainofresponsibility.Order;

public class DiscountPerValue extends Middleware {

    @Override
    public void apply(Order order) {
        if (order.orderValue() > 1000.0) {
            System.out.println("Giving discount per value.");
        }else {
            System.out.println("Skipping discount per value.");
        }

        this.applyNext(order);
    }
}