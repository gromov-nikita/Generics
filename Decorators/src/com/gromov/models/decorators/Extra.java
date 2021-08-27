package com.gromov.models.decorators;

import com.gromov.models.interfaces.Order;

public abstract class Extra implements Order {
    private Order order;
    public Extra(Order order) {
        this.order = order;
    }
    protected Order getOrder() {//protected бо этод метод используется только в 'decorators'
        return order;
    }
}
