package com.kodilla.good.patterns.challenges.smallAirport;

import java.util.ArrayList;
import java.util.List;

public class FlightsDatabase {
    public List<Flight> makingDatabase () {
        Flight flight1 = new Flight("Wrocaław", "Warszawa");
        Flight flight2 = new Flight("Warszawa", "Gdańsk");
        Flight flight3 = new Flight("Katowice", "Wrocław");
        Flight flight4 = new Flight("Katowice", "Gdańsk");
        Flight flight5 = new Flight("Katowice", "Berlin");
        Flight flight6 = new Flight("Rio de Janeiro", "Warszawa");
        Flight flight7 = new Flight("Gdańsk", "Rio de Janeiro");
        Flight flight8 = new Flight("Berlin", "Warszawa");
        Flight flight9 = new Flight("Warszawa", "Berlin");
        Flight flight10 = new Flight("Berlin", "Katowice");
        Flight flight11 = new Flight("Rio de Janeiro", "Katowice");

        List<Flight> flightList = new ArrayList<>();
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);
        flightList.add(flight7);
        flightList.add(flight8);
        flightList.add(flight9);
        flightList.add(flight10);
        flightList.add(flight11);

        return flightList;
    }
}
