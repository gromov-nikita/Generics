package com.gromov.decorators;

import com.gromov.models.Order;

public abstract class Extra implements Order {
    protected int price;
    protected String label;
    protected Order order;
    public Extra(int price, String label, Order order) {
        this.price = price;
        this.label = label;
        this.order = order;
    }
    public abstract int getPrice();
    public String getLabel() {
        return order.getLabel() + " " + label;
    }
}
