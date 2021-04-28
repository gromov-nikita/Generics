package com.gromov.decorators.forJuice;

import com.gromov.decorators.Extra;
import com.gromov.models.Order;

public class Tubules extends Extra {
    public Tubules(Order order) {
        super(1,"Tubules", order);
    }
    @Override
    public int getPrice() {
        return order.getPrice() + 1;
    }
}
