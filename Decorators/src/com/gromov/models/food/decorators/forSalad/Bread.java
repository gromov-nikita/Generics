package com.gromov.models.food.decorators.forSalad;

import com.gromov.models.food.decorators.Extra;
import com.gromov.models.food.interfaces.IOrder;

public class Bread extends Extra {
    public Bread(IOrder IOrder) {
        super(IOrder);
    }
    @Override
    public int getFinalPrice() {
        return getIOrder().getFinalPrice() + 4;
    }
    @Override
    public String getFinalLabel() {
        return getIOrder().getFinalLabel() + " Bread ";
    }
}
