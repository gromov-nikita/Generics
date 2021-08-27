package com.gromov.models.decorators.forJuice;

import com.gromov.models.decorators.Extra;
import com.gromov.models.interfaces.Order;

public class Tubules extends Extra {
    public Tubules(Order order) {
        super(order);
    }
    @Override
    public int getFinalPrice() {
        return getOrder().getFinalPrice() + 1;
    }
    @Override
    public String getFinalLabel() {
        return getOrder().getFinalLabel() + " Tubules ";
    }
}
