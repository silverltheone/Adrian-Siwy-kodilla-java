package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearchEngine {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightmap = new HashMap<>();
        flightmap.put("Okęcie", true);
        flightmap.put("JFK", true);
        flightmap.put("Pyrzowice", false);
        flightmap.put("Paris", true);
        flightmap.put("London", false);
        flightmap.put("Hamburg", true);

        if(flightmap.get(flight.getArrivalAirport()) != null && flightmap.get(flight.getDepartureAirport()) != null) {
            System.out.println("Czy możliwy wylot z lotniska " + flight.getDepartureAirport() + " " + flightmap.get(flight.getDepartureAirport()));
            System.out.println("Czy możliwy przylot na lotnisko: " + flight.getArrivalAirport() + " " + flightmap.get(flight.getArrivalAirport()));
        } else  {
            throw new RouteNotFoundException();
        }

    }
}
