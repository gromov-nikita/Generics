package com.gromov.decorators.universal;

import com.gromov.decorators.Extra;
import com.gromov.models.Order;

public class Salt extends Extra {
    public Salt(Order order) {
        super(2,"Salt", order);
    }
    @Override
    public int getPrice() {
        return order.getPrice() + 2;
    }
}
