/*
Please do task that I provided you for decorators:

Provide system for item ordering: items can have different options (with juice, meet, salad..)
 */

import com.gromov.models.decorators.forJuice.Tubules;
import com.gromov.models.decorators.forMeet.Sauce;
import com.gromov.models.decorators.forSalad.Bread;
import com.gromov.models.decorators.universal.Salt;
import com.gromov.models.interfaces.Order;
import com.gromov.models.mainCourse.Juice;
import com.gromov.models.mainCourse.Meet;
import com.gromov.models.mainCourse.Salad;

public class Runner {
    public static void main(String[] args) {
        Order order1 = new com.gromov.models.decorators.universal.Double(new Tubules(
                new Juice("Apple", 10)));
        System.out.println("Order 1:");
        System.out.println(order1.getFinalLabel());
        System.out.println(order1.getFinalPrice());
        Order order2 = new Sauce(
                new Salt(new com.gromov.models.decorators.universal.Double(
                        new Meet("Pork", 15))));
        System.out.println("Order 2:");
        System.out.println(order2.getFinalLabel());
        System.out.println(order2.getFinalPrice());
        Order order3 = new Bread(new Salad("Russian salad", 10));
        System.out.println("Order 3:");
        System.out.println(order3.getFinalLabel());
        System.out.println(order3.getFinalPrice());
    }
}
