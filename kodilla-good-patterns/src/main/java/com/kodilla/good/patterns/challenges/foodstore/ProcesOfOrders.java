package com.kodilla.good.patterns.challenges.foodstore;

public class ProcesOfOrders {

    public boolean process(Order order) {
        Supplier supplier = SupplierFactory.getSupplier(order.getSupplierName());
        OrderConfirmationDto orderConfirmationDto = supplier.processOrder(order);
        return orderConfirmationDto.isOrdered();
    }
}
