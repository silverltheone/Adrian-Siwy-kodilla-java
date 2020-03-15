package com.kodilla.good.patterns.challenges.smallAirport;

public class Main {
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();
        searchEngine.searchEngineFromDeparture("Katowice");
        searchEngine.searchEngineToArrival("Rio de Janeiro");
        searchEngine.searchEngineThru("Katowice", "Berlin", "Warszawa");

    }
}
