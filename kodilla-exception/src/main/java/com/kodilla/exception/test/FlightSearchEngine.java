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

        if(flightmap.get(flight.getArrivalAirport()) != null) {
            if(flightmap.get(flight.getArrivalAirport()) == true) {
                System.out.println("Przylot na lotnisko: " + flight.getArrivalAirport() + " jest możliwy.");
            } else {
                System.out.println("Przylot na lotnisko: " + flight.getArrivalAirport() + " nie jest możliwy.");
            }
        } else  {
            throw new RouteNotFoundException();
        }
    }
}
