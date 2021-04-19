package coffeeHouse.decorators;

import coffeeHouse.Order;

public class Chocolate extends Decorator {
    public Chocolate(Order order) {
        super("Chocolate",20,order);
    }
    @Override
    public double getPrice() {
        return price + getOrder().getPrice();
    }
    @Override
    public String getLabel() {
        return getOrder().getLabel() + " Chocolate";
    }
}
