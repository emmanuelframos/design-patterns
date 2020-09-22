package br.com.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String paymentForm;
    private List<OrderItem> items;

    public List<OrderItem> getItems() {
        return items;
    }

    public Order addItem(OrderItem orderItem) {
        if (items == null)
            this.items = new ArrayList<>();

        this.items.add(orderItem);

        return this;
    }

    public String getPaymentForm() {
        return paymentForm;
    }

    public Order paymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    public Integer countItems(){
        return items != null
            ? items.size()
            : 0;
    }

    public Double orderValue(){
        return items != null
                ? items.stream()
                    .mapToDouble(OrderItem::getValue)
                    .sum()
                : 0.0;
    }
}