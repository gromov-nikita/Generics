package com.gromov.models.mainCourse;

import com.gromov.models.interfaces.Order;

public class Salad extends Food implements Order {
    public Salad(String label, int price) {
        super(label, price);
    }
    @Override
    public int getFinalPrice() {
        return price;
    }
    @Override
    public String getFinalLabel() {
        return label;
    }
}
