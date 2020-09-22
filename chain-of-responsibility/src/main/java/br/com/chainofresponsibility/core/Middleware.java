package br.com.chainofresponsibility.core;

import br.com.chainofresponsibility.Order;

public abstract class Middleware {

    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract void apply(Order order);

    protected void applyNext(Order order) {
        if (next != null)
            next.apply(order);
    }
}
