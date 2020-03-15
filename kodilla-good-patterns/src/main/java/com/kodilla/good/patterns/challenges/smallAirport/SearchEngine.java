package com.kodilla.good.patterns.challenges.smallAirport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {

    public List<Flight> searchEngineFromDeparture (String departureAirport) {
        List<Flight> searchingFlightsFromDeparture = new ArrayList<>();
        FlightsDatabase flightsDatabase = new FlightsDatabase();
        searchingFlightsFromDeparture =  flightsDatabase.makingDatabase().stream()
                .filter(s -> s.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
        System.out.println("Zalezione loty z: " + departureAirport + " to: ");
        searchingFlightsFromDeparture.stream()
                .forEach(n -> System.out.println(n.getDepartureAirport() + " - " + n.getArrivalAirport()));
        return searchingFlightsFromDeparture;
    }

    public List<Flight> searchEngineToArrival (String arrivalAirport) {
        List<Flight> searchingFlightsFromArrival = new ArrayList<>();
        FlightsDatabase flightsDatabase = new FlightsDatabase();
        searchingFlightsFromArrival =  flightsDatabase.makingDatabase().stream()
                .filter(s -> s.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
        System.out.println("Zalezione loty do: " + arrivalAirport + " to: ");
        searchingFlightsFromArrival.stream()
                .forEach(n -> System.out.println(n.getDepartureAirport() + " - " + n.getArrivalAirport()));
        return searchingFlightsFromArrival;
    }

    public List<Flight> searchEngineThru (String departureAirport, String thruAirport, String arrivalAirport) {
        List<Flight> searchingFlightsFrom = new ArrayList<>();
        List<Flight> searchingFlightsThru = new ArrayList<>();
        List<Flight> finalSearchresult = new ArrayList<>();
        FlightsDatabase flightsDatabase = new FlightsDatabase();
        searchingFlightsFrom = flightsDatabase.makingDatabase().stream()
                .filter(s -> s.getDepartureAirport().equals(departureAirport))
                .filter(n -> n.getArrivalAirport().equals(thruAirport))
                .collect(Collectors.toList());
        searchingFlightsThru = flightsDatabase.makingDatabase().stream()
                .filter(m -> m.getDepartureAirport().equals(thruAirport))
                .filter(o -> o.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        finalSearchresult.addAll(searchingFlightsFrom);
        finalSearchresult.addAll(searchingFlightsThru);
        System.out.println("Znaleziono przelot z: " + departureAirport + " do: " + arrivalAirport + " przez: :" + thruAirport);
        finalSearchresult.stream()
                .forEach(p -> System.out.println(p.getDepartureAirport() + " " + p.getArrivalAirport()));
        return finalSearchresult;
    }
}
