package br.com.chainofresponsibility;

import br.com.chainofresponsibility.core.DiscountPerItem;
import br.com.chainofresponsibility.core.DiscountPerValue;
import br.com.chainofresponsibility.core.DiscountInPayment;
import br.com.chainofresponsibility.core.Middleware;
import org.junit.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void test_chainofresponsibility(){
        Order order = buildOrder();

        Middleware middleware = new DiscountPerItem();
        middleware
                .linkWith(new DiscountPerValue())
                .linkWith(new DiscountInPayment());

        middleware.apply(order);
    }

    private Order buildOrder(){
        OrderItem smartphone = new OrderItem();
        smartphone.setId(1L);
        smartphone.setDescription("iPhone");
        smartphone.setValue(2000.0);

        OrderItem tv = new OrderItem();
        tv.setId(2L);
        tv.setDescription("Samsung TV");
        tv.setValue(1000.0);

        return new Order()
                .paymentForm("card")
                .addItem(smartphone)
                .addItem(tv);
    }
}