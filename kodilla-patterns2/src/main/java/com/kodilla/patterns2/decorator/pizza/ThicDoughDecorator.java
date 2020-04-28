package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThicDoughDecorator extends AbstractPizzaOrderDecorator {
    public ThicDoughDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        //fixed cost + 10
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " on thick dough";
    }
}
