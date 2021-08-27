package com.gromov.models.decorators.universal;

import com.gromov.models.decorators.Extra;
import com.gromov.models.interfaces.Order;

public class Salt extends Extra {
    public Salt(Order order) {
        super(order);
    }
    @Override
    public int getFinalPrice() {
        return getOrder().getFinalPrice() + 2;
    }
    @Override
    public String getFinalLabel() {
        return getOrder().getFinalLabel() + " Salt ";
    }
}
