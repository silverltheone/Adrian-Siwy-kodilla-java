package com.kodilla.good.patterns.challenges.foodstore;

public class FoodStoreMain {
    public static void main(String[] args) {
        Order order = new Order("HealthyFood", "Gruszki", 12.5);
        ProcesOfOrders procesOfOrders = new ProcesOfOrders();
        procesOfOrders.process(order);

    }
}
