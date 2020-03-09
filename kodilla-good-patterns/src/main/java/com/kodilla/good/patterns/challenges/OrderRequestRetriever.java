package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Adam", "Kowalski");
        LocalDateTime orderDate = LocalDateTime.of(2020,8,1,12,30);
        Product product = new Product("Toy Car", 100150);

        return new OrderRequest(user, orderDate, product);
    }
}
