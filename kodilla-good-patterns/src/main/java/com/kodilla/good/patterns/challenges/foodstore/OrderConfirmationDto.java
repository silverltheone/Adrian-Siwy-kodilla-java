package com.kodilla.good.patterns.challenges.foodstore;

public class OrderConfirmationDto {
    private boolean isOrdered;

    public OrderConfirmationDto(boolean isOrdered) {
        this.isOrdered = isOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
