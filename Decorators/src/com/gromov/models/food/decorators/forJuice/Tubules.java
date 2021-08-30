package com.gromov.models.food.decorators.forJuice;

import com.gromov.models.food.decorators.Extra;
import com.gromov.models.food.interfaces.IOrder;

public class Tubules extends Extra {
    public Tubules(IOrder IOrder) {
        super(IOrder);
    }
    @Override
    public int getFinalPrice() {
        return getIOrder().getFinalPrice() + 1;
    }
    @Override
    public String getFinalLabel() {
        return getIOrder().getFinalLabel() + " Tubules ";
    }
}
