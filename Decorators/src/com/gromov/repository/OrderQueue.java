package com.gromov.repository;

import com.gromov.models.food.interfaces.IOrder;

import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    private Queue<IOrder> IOrders;
    public OrderQueue() {
        IOrders = new LinkedList();
    }
    public void pushOrder(IOrder IOrder) {
        IOrders.add(IOrder);
    }
    public IOrder pullOrder() {
        return IOrders.remove();
    }
    public boolean isEmpty() {
        return IOrders.isEmpty();
    }
}
