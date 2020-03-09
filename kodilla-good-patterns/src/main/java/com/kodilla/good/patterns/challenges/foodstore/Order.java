package com.kodilla.good.patterns.challenges.foodstore;

public class Order {
    public String suppliername;
    public String productName;
    public double quantity;

    public Order(String suppliername, String productName, double quantity) {
        this.suppliername = suppliername;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }
}
