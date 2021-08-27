package com.gromov.models.decorators.forSalad;

import com.gromov.models.decorators.Extra;
import com.gromov.models.interfaces.Order;

public class Bread extends Extra {
    public Bread(Order order) {
        super(order);
    }
    @Override
    public int getFinalPrice() {
        return getOrder().getFinalPrice() + 4;
    }
    @Override
    public String getFinalLabel() {
        return getOrder().getFinalLabel() + " Bread ";
    }
}
