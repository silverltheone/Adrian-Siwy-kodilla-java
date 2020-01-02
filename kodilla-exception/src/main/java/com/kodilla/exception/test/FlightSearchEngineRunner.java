package com.kodilla.exception.test;

public class FlightSearchEngineRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("JFK", "Rabat");
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        try {
            flightSearchEngine.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Brak lotniska na liście");
        }

        System.out.println("Kończe działanie wyszukiwarki");
    }
}
