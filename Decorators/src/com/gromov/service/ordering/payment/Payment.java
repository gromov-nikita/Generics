package com.gromov.service.ordering.payment;

import com.gromov.models.food.interfaces.IOrder;
import com.gromov.repository.OrderQueue;
import com.gromov.service.ordering.payment.interfaces.IPayment;

public class Payment implements IPayment {
    private IOrder order;
    private OrderQueue orderQueue;
    public Payment(IOrder order, OrderQueue queue) {
        this.order = order;
        this.orderQueue = queue;
    }
    public IOrder getOrder() {
        return order;
    }
    @Override
    public void pay() {
        orderQueue.pushOrder(order);
        System.out.println("Label: " + order.getFinalLabel());
        System.out.println("Original price: " + order.getFinalPrice());
    }
}