/*
Please do task that I provided you for decorators:

Provide system for item ordering: items can have different options (with juice, meet, salad..)
 */

import com.gromov.decorators.forJuice.Tubules;
import com.gromov.decorators.forMeet.Sauce;
import com.gromov.decorators.forSalad.Bread;
import com.gromov.decorators.universal.Double;
import com.gromov.decorators.universal.Salt;
import com.gromov.models.Juice;
import com.gromov.models.Meet;
import com.gromov.models.Order;
import com.gromov.models.Salad;

public class Runner {
    public static void main(String[] args) {
        Order order1 = new Juice("Apple", 10);
        order1 = new Double(order1);
        order1 = new Tubules(order1);
        System.out.println(order1.getLabel());
        System.out.println(order1.getPrice());
        Order order2 = new Meet("Pork", 50);
        order2 = new Double(order2);
        order2 = new Sauce(3,"mayonnaise",order2);
        order2 = new Salt(order2);
        System.out.println(order2.getLabel());
        System.out.println(order2.getPrice());
        Order order3 = new Salad("Caesar", 15);
        order3 = new Double(order3);
        order3 = new Bread(3,"default",order3);
        order3 = new Salt(order3);
        System.out.println(order3.getLabel());
        System.out.println(order3.getPrice());

    }
}
