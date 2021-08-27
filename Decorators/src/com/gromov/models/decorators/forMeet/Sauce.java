package com.gromov.models.decorators.forMeet;

import com.gromov.models.decorators.Extra;
import com.gromov.models.interfaces.Order;

public class Sauce extends Extra {
    public Sauce(Order order) {
        super(order);
    }
    @Override
    public int getFinalPrice() {
        return getOrder().getFinalPrice() + 10;
    }
    @Override
    public String getFinalLabel() {
        return getOrder().getFinalLabel() + " Sauce ";
    }
}
