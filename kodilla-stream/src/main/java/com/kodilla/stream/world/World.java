package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final String worldName;
    private final List<Continent> continentList = new ArrayList<>();

    public World(String worldName) {
        this.worldName = worldName;
    }

    public String getWorldName() {
        return worldName;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public boolean removeContinent(Continent continent){
        return continentList.remove(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
