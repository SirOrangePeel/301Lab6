package com.example.listcity;


/**
 * This is a class that defines a city
 */
public class City implements Comparable<City>{
    private String city;
    private String province;


    /**
     * This is a constructor for the city class
     * @param city
     * @param province
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This is a getter for the city name
     * @return
     * Return the city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This is a getter for the province name
     * @return
     * Return the province name
     */
    String getProvinceName(){
        return this.province;
    }


    /**
     * This is a comparator for the city class
     * @param o the object to be compared.
     * @return the comparison of two cities
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName()); // this.city refers to the city name
    }
}
