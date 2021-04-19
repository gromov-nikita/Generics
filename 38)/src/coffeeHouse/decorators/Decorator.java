package coffeeHouse.decorators;
import coffeeHouse.Order;
public abstract class Decorator implements Order {
    protected Order order;
    protected String label;
    protected double price;
    public Decorator(String label, double price, Order order) {
        this.order = order;
        this.label = label;
        this.price = price;
    }
    public Order getOrder() {
        return order;
    }
    @Override
    public abstract double getPrice();
    @Override
    public abstract String getLabel();
}
