package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String nameOfContinent;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public boolean removeCountry(Country country){
        return countryList.remove(country);
    }

}
