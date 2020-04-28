package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaWithAllOptionsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleSizeDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        theOrder = new ThicDoughDecorator(theOrder);
        theOrder = new AdditionalHamDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost =  theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(50), theCost);
    }

    @Test
    public void testPizzaWithAllOptionsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleSizeDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        theOrder = new ThicDoughDecorator(theOrder);
        theOrder = new AdditionalHamDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description =  theOrder.getDescription();
        //Then
        assertEquals("Pizza double size + garlic sauce on thick dough + ham", description);
    }
}
