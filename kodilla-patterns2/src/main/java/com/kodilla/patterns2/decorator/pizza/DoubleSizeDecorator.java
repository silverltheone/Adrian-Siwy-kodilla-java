package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleSizeDecorator extends AbstractPizzaOrderDecorator{

    public DoubleSizeDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        //fixed cost + 10
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " double size";
    }
}
