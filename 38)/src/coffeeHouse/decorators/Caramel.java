package coffeeHouse.decorators;

import coffeeHouse.Order;

public class Caramel extends Decorator {
    public Caramel(Order order) {
        super("Caramel",10,order);
    }
    @Override
    public double getPrice() {
        return price + getOrder().getPrice();
    }
    @Override
    public String getLabel() {
        return getOrder().getLabel() + " Caramel";
    }
}
