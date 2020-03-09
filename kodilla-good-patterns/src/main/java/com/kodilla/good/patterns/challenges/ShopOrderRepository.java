package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ShopOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime orderDate, Product product) {
        return false;
    }
}
