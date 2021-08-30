package com.gromov.models.food.mainCourse;

import com.gromov.models.food.interfaces.IOrder;

public class Salad extends Food implements IOrder {
    public Salad(String label, int price) {
        super(label, price);
    }
    @Override
    public int getFinalPrice() {
        return getPrice();
    }
    @Override
    public String getFinalLabel() {
        return getLabel();
    }
}
