package br.com.chainofresponsibility.core;

import br.com.chainofresponsibility.Order;

public class DiscountInPayment extends Middleware {

    @Override
    public void apply(Order order) {
        if (order.getPaymentForm().equals("card")){
            System.out.println("Giving discount in payment form.");
        }else {
            System.out.println("Skipping discount in payment form.");
        }

        this.applyNext(order);
    }
}