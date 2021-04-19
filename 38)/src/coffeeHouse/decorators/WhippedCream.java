package coffeeHouse.decorators;

import coffeeHouse.Order;

public class WhippedCream extends Decorator {
    public WhippedCream(Order order) {
        super("Whipped cream", 17,order);
    }
    @Override
    public double getPrice() {
        return price + getOrder().getPrice();
    }

    @Override
    public String getLabel() {
        return getOrder().getLabel() + " Whipped cream";
    }

}
