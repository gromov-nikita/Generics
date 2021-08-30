package com.gromov.models.food.decorators.universal;

import com.gromov.models.food.decorators.Extra;
import com.gromov.models.food.interfaces.IOrder;

public class Salt extends Extra {
    public Salt(IOrder IOrder) {
        super(IOrder);
    }
    @Override
    public int getFinalPrice() {
        return getIOrder().getFinalPrice() + 2;
    }
    @Override
    public String getFinalLabel() {
        return getIOrder().getFinalLabel() + " Salt ";
    }
}
