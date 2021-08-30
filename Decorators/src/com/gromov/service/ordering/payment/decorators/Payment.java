package com.gromov.service.ordering.payment.decorators;

import com.gromov.models.food.interfaces.IOrder;
import com.gromov.repository.OrderQueue;
import com.gromov.service.ordering.payment.interfaces.IPayment;

public class Payment implements IPayment {
    private IPayment payment;
    public Payment(IPayment payment) {
        this.payment = payment;
    }
    @Override
    public boolean pay() {
        return payment.pay();
    }
}
