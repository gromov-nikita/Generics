package com.gromov.decorators.forSalad;

import com.gromov.decorators.Extra;
import com.gromov.models.Order;

public class Bread extends Extra {
    public Bread(int price, String label, Order order) {
        super(price, label, order);
    }
    @Override
    public int getPrice() {
        return order.getPrice() + price;
    }
}
