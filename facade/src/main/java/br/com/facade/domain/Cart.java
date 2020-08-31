package br.com.facade.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> items;

    public void addItem(Product product){
        if (items == null)
            this.items = new ArrayList<>();

        this.items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }
}
