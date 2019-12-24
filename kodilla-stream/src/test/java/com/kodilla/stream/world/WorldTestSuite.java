package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class WorldTestSuite {
    @Test
    public void testgetPeopleQuantity() {

        //Given
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country germany = new Country("Germany", new BigDecimal("60000000"));
        Country france = new Country("France", new BigDecimal("80000000"));
        Country usa = new Country("USA", new BigDecimal("4000000000"));
        Country mexico = new Country("Mexico", new BigDecimal("20000000"));
        Country canada = new Country("Canada", new BigDecimal("80000000"));
        Country brasil = new Country("Brasil", new BigDecimal("100000000"));
        Country argentina = new Country("Canada", new BigDecimal("80000000"));
        Country china = new Country("China", new BigDecimal("1000000000"));
        Country russia = new Country("Russia", new BigDecimal("500000000"));
        Country kongo = new Country("Kongo Rep.", new BigDecimal("50000000"));
        Country egipt = new Country("Egipt", new BigDecimal("40000000"));




        Continent europe = new Continent("Europe");
        Continent nAmerica = new Continent("North America");
        Continent sAmerica = new Continent("South America");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        World earth = new World("Earth");

        //When
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        nAmerica.addCountry(usa);
        nAmerica.addCountry(mexico);
        nAmerica.addCountry(canada);
        sAmerica.addCountry(brasil);
        sAmerica.addCountry(argentina);
        asia.addCountry(china);
        asia.addCountry(russia);
        africa.addCountry(kongo);
        africa.addCountry(egipt);


        earth.addContinent(europe);
        earth.addContinent(nAmerica);
        earth.addContinent(sAmerica);
        earth.addContinent(asia);
        earth.addContinent(africa);

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("6050000000");
        BigDecimal worldPeopleQuantity = earth.getPeopleQuantity();
        Assert.assertEquals(expectedPeopleQuantity, worldPeopleQuantity);
    }


}
