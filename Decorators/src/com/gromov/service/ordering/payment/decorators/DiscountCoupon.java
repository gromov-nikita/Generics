package com.gromov.service.ordering.payment.decorators;

import com.gromov.service.ordering.payment.Payment;
import com.gromov.service.ordering.payment.interfaces.IPayment;

public class DiscountCoupon implements IPayment {
    private double discount;
    private Payment payment;
    public DiscountCoupon(double discount, Payment payment) {
        this.payment = payment;
        this.discount = discount;
    }
    @Override
    public void pay() {
        payment.pay();
        System.out.println("Discount price: " + payment.getOrder().getFinalPrice() * (1 - discount));
    }
}
