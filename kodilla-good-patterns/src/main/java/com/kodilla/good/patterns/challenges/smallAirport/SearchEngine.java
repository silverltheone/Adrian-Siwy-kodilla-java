package com.kodilla.good.patterns.challenges.smallAirport;

public class SearchEngine {

    public void searchEngineFromDeparture (String departureAirport) {
        FlightsDatabase flightsDatabase = new FlightsDatabase();
        flightsDatabase.makingDatabase().stream()
                .filter(s -> s.getDepartureAirport().equals(departureAirport))
                .forEach(n -> System.out.println("Znalezione wyloty z: " + n.getDepartureAirport() + " to: " + n.getDepartureAirport() + " - " + n.getArrivalAirport()));
    }

    public void searchEngineToArrival (String arrivalAirport) {
        FlightsDatabase flightsDatabase = new FlightsDatabase();
        flightsDatabase.makingDatabase().stream()
                .filter(s -> s.getArrivalAirport().equals(arrivalAirport))
                .forEach(n -> System.out.println("Znalezione przyloty do: " + n.getArrivalAirport() + "to: " + n.getDepartureAirport() + " - " + n.getArrivalAirport()));
    }
}
