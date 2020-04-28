package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalHamDecorator extends AbstractPizzaOrderDecorator {
    public AdditionalHamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        //fixed cost + 5
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + ham";
    }
}
