package coffeeHouse.decorators;

import coffeeHouse.Order;

public class SteamedMilk extends Decorator {
    public SteamedMilk(Order order) {
        super("Steamed milk", 15,order);
    }
    @Override
    public double getPrice() {
        return getOrder().getPrice() + price;
    }
    @Override
    public String getLabel() {
        return getOrder().getLabel() + " Steamed milk";
    }
}
