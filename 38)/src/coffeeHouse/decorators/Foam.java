package coffeeHouse.decorators;

import coffeeHouse.Order;

public class Foam extends Decorator {
    public Foam(Order order) {
        super("Foam",5,order);
    }
    @Override
    public double getPrice() {
        return price + getOrder().getPrice();
    }
    @Override
    public String getLabel() {
        return getOrder().getLabel() + " Foam";
    }
}
