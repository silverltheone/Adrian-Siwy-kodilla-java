package com.kodilla.good.patterns.challenges.foodstore;

public interface Supplier {
    OrderConfirmationDto processOrder(Order order);
}
