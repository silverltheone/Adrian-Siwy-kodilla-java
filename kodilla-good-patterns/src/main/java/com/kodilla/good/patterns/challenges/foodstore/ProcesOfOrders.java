package com.kodilla.good.patterns.challenges.foodstore;

public class ProcesOfOrders {

    public boolean process(Order order) {
        Supplier supplier = new Supplier(order.getSuppliername());
        System.out.println("Order to: " + order.getSuppliername() + " was made for: " + order.getProductName() + " " + order.getQuantity() + " kg");
        return true;
    }
}
