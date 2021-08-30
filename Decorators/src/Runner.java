/*
Please do task that I provided you for decorators:

Provide system for item ordering: items can have different options (with juice, meet, salad..)
 */

import com.gromov.models.food.decorators.forJuice.Tubules;
import com.gromov.models.food.decorators.forMeet.Sauce;
import com.gromov.models.food.decorators.forSalad.Bread;
import com.gromov.models.food.decorators.universal.Salt;
import com.gromov.models.food.interfaces.IOrder;
import com.gromov.models.food.mainCourse.Juice;
import com.gromov.models.food.mainCourse.Meet;
import com.gromov.models.food.mainCourse.Salad;
import com.gromov.repository.OrderQueue;

public class Runner {
    public static void main(String[] args) {
        IOrder IOrder1 = new com.gromov.models.food.decorators.universal.Double(new Tubules(
                new Juice("Apple", 10)));
        IOrder IOrder2 = new Sauce(
                new Salt(new com.gromov.models.food.decorators.universal.Double(
                        new Meet("Pork", 15))));
        IOrder IOrder3 = new Bread(new Salad("Russian salad", 10));
        OrderQueue queue = new OrderQueue();


    }
}
