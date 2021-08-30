package com.gromov.models.food.decorators.forMeet;

import com.gromov.models.food.decorators.Extra;
import com.gromov.models.food.interfaces.IOrder;

public class Sauce extends Extra {
    public Sauce(IOrder IOrder) {
        super(IOrder);
    }
    @Override
    public int getFinalPrice() {
        return getIOrder().getFinalPrice() + 10;
    }
    @Override
    public String getFinalLabel() {
        return getIOrder().getFinalLabel() + " Sauce ";
    }
}
