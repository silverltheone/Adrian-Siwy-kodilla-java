package com.kodilla.good.patterns.challenges.foodstore;

import java.util.Random;

public class HealthyShop implements Supplier {
    @Override
    public OrderConfirmationDto processOrder(Order order) {
        System.out.println(order.getProductName() + " is ordered.");
        Random random = new Random();
        return new OrderConfirmationDto(random.nextBoolean());
    }
}
