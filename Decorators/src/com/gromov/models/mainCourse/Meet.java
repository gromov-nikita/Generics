package com.gromov.models.mainCourse;

import com.gromov.models.interfaces.Order;

public class Meet extends Food implements Order {
    public Meet(String label, int price) {
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
