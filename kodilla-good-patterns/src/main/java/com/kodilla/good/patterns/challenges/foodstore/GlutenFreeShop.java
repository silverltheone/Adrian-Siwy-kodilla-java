package com.kodilla.good.patterns.challenges.foodstore;

import java.util.Random;

public class GlutenFreeShop implements Supplier {
    @Override
    public OrderConfirmationDto processOrder(Order order) {
        System.out.println(order.getProductName() + "from " + order.getSupplierName() + " is ordered.");
        Random random = new Random();
        return new OrderConfirmationDto(random.nextBoolean());
    }
}
