package com.gromov.decorators.universal;

import com.gromov.decorators.Extra;
import com.gromov.models.Order;

public class Double extends Extra {
    public Double(Order order) {
        super(order.getPrice() * 2,"Double", order);
    }
    @Override
    public int getPrice() {
        return order.getPrice() * 2;
    }
}
