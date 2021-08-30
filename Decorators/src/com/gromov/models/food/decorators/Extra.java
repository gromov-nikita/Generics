package com.gromov.models.food.decorators;

import com.gromov.models.food.interfaces.IOrder;

public abstract class Extra implements IOrder {
    private IOrder IOrder;
    public Extra(IOrder IOrder) {
        this.IOrder = IOrder;
    }
    protected IOrder getIOrder() {
        return IOrder;
    }
}
