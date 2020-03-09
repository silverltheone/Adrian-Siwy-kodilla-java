package com.kodilla.good.patterns.challenges.foodstore;

public class SupplierFactory {
    public static Supplier getSupplier(String supplierName) {
        if(supplierName.equals("ExtraFoodShop")) return new ExtraFoodShop();
        else if(supplierName.equals("GlutenFreeShop")) return new GlutenFreeShop();
        else if(supplierName.equals("HealthyShop")) return new HealthyShop();
        return null;
    }
}
