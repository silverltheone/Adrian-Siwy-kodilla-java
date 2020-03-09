package com.kodilla.good.patterns.challenges;

public class ProductOrderMain {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ShopOrderService(), new ShopOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
