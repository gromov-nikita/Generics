package com.gromov.models;


public class Juice implements Order {
    private int price;
    private String label;

    public Juice(String label, int price) {
        this.label = label;
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public String getLabel() {
        return label;
    }
}
