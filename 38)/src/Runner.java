import coffeeHouse.Coffee;
import coffeeHouse.Order;
import coffeeHouse.decorators.*;

/*
Exercise 38: (4) Create a simple Decorator system by starting with basic coffee, then
providing decorators of steamed milk, foam, chocolate, caramel and whipped cream.
 */
public class Runner {
    public static void main(String[] args) {
        Order coffee = new Coffee("Americano", 50);
        coffee = new Foam(coffee);
        coffee = new SteamedMilk(coffee);
        System.out.println(coffee.getLabel());
        System.out.println(coffee.getPrice());
    }
}
