package com.gromov.models.food.mainCourse;

import com.gromov.models.food.interfaces.IOrder;

public class Meet extends Food implements IOrder {
    public Meet(String label, int price) {
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
