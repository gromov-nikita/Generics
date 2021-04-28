package com.gromov.decorators.forMeet;

import com.gromov.decorators.Extra;
import com.gromov.models.Order;

public class Sauce extends Extra {
    public Sauce(int price, String label, Order order) {
        super(price, label, order);
    }
    @Override
    public int getPrice() {
        return order.getPrice() + price;
    }
}
