package com.gromov.service.ordering.payment.decorators;

import com.gromov.models.food.interfaces.IOrder;
import com.gromov.repository.OrderQueue;
import com.gromov.service.ordering.payment.interfaces.IPayment;

public class PaymentByCard extends Payment {
    public PaymentByCard(IOrder order, IPayment payment, OrderQueue queue) {
        super(order, payment, queue);
    }
    @Override
    public boolean pay() {
        boolean bool = super.pay();
        System.out.println(" card.");
        return bool;
    }
}
