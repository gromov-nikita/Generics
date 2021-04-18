package coffeeHouse.decorators;

import coffeeHouse.Order;

public class SteamedMilk extends Decorator {
    public SteamedMilk(String label, double price, Order order) {
        super(label,price,order);
    }
    @Override
    public double getPrice() {
        return getPrice() + getOrder().getPrice();
    }
    @Override
    public String getLabel() {
        return getOrder().getLabel() + "SteamedMilk";
    }
}
