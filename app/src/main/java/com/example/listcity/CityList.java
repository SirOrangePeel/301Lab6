package com.example.listcity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private final List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if the city exists in the list
     *
     * @param city
     * @return if the city is in the list
     */
    public Boolean hasCity(City city)
    {
        for (City c : cities) {
            if (c.compareTo(city) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * This deletes a city from the list
     *
     * @param city
     */
    public void delete(City city)
    {
        if (!this.hasCity(city))
            throw new IllegalArgumentException();

        cities.remove(city);
    }

    /**
     * This counts the number of cities in the list
     *
     * @return the number of cities
     */
    public int countCities()
    {
        return cities.size();
    }
}
