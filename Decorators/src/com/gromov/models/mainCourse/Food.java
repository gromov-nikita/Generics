package com.gromov.models.mainCourse;

public class Food {
    /*
        Я специально оставил модификатор доступа по умолчанию чтобы не дублировать геттеры в
        производных классах т.к. фунция методов в интерфейсе Order+- для классов этого пакета одинакова
    */
    int price;
    String label;
    public Food(String label, int price) {
        this.label = label;
        this.price = price;
    }
}
