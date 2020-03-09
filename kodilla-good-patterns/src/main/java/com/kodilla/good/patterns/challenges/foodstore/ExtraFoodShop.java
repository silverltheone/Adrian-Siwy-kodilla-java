package com.kodilla.good.patterns.challenges.foodstore;

import java.util.Random;

public class ExtraFoodShop implements Supplier {
    @Override
    public OrderConfirmationDto processOrder(Order order) {
        Random random = new Random();
        return new OrderConfirmationDto(random.nextBoolean());
    }
}
