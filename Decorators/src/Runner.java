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
import com.gromov.service.ordering.payment.Payment;
import com.gromov.service.ordering.payment.decorators.DiscountCoupon;
import com.gromov.service.ordering.payment.interfaces.IPayment;

public class Runner {
    public static void main(String[] args) {
        IOrder order1 = new com.gromov.models.food.decorators.universal.Double(new Tubules(
                new Juice("Apple", 10)));
        IOrder order2 = new Sauce(
                new Salt(new com.gromov.models.food.decorators.universal.Double(
                        new Meet("Pork", 15))));
        IOrder order3 = new Bread(new Salad("Russian salad", 10));
        OrderQueue queue = new OrderQueue();
        IPayment payment1 = new Payment(order1, queue);
        IPayment payment2 = new Payment(order2, queue);
        payment2 = new DiscountCoupon(0.3 , (Payment) payment2);
        payment1.pay();
        System.out.println("___________________");
        payment2.pay();



    }
}
