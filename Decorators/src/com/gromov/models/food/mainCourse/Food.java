package com.gromov.models.food.mainCourse;

public class Food {

    private int price;
    private String label;
    public Food(String label, int price) {
        this.label = label;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String getLabel() {
        return label;
    }
}
