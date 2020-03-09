package com.kodilla.good.patterns.challenges.foodstore;

public class Order {
    public String supplierName;
    public String productName;
    public double quantity;

    public Order(String supplierName, String productName, double quantity) {
        this.supplierName = supplierName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }
}
