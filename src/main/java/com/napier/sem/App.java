package com.napier.sem;

import java.util.ArrayList;
import java.sql.*;

public class App {

    /**
     * Connect to database and run report.
     *
     * @param args string
     */
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager();
        App a = new App();

        // Connect to DB
        if (args.length < 1) {
            db.connect("localhost:33060");
        } else {
            db.connect(args[0]);
        }
        // Main report
        a.mainReport();

        // Disconnect DB
        db.disconnect();
    }

    /**
     * Runs the main report
     */
    private void mainReport() {
        System.out.println("All countries by population from largest to smallest:\n");
        ArrayList<Country> countries = this.worldCountriesByPopulationLS();
        this.printCountries(countries);
    }

    /**
     * Prints countries.
     *
     * @param countries countries to print.
     */
    private void printCountries(ArrayList<Country> countries) {
        System.out.println(String.format("%-10s %-15s %-20s", "Name", "Continent", "Population"));

        for (Country country : countries) {
            String formatted_string =
                    String.format("%-10s %-15s %-20s",
                            country.Name, country.Continent, country.Population);
            System.out.println(formatted_string);
        }
    }

    /**
     * The population of the world.
     *
     * @return
     */
    public ArrayList<Country> worldPopulation() {
        return null;
    }

    /**
     * The population of a continent.
     *
     * @return
     */
    public ArrayList<Country> continentPopulation(String continent) {
        return null;
    }

    /**
     * The population of a region.
     *
     * @return
     */
    public ArrayList<Country> regionPopulation(String region) {
        return null;
    }

    /**
     * The population of a country.
     *
     * @return
     */
    public ArrayList<Country> countryPopulation(String country) {
        return null;
    }

    /**
     * The population of a district.
     *
     * @return
     */
    public ArrayList<Country> districtPopulation(String district) {
        return null;
    }

    /**
     * The population of a city.
     *
     * @return
     */
    public ArrayList<Country> cityPopulation(String city) {
        return null;
    }

    /**
     * All the countries in the world organised by largest population to smallest.
     *
     * @return countries
     */
    private ArrayList<Country> worldCountriesByPopulationLS() {
        try {
            DatabaseManager db = new DatabaseManager();
            String query =
                    "SELECT Name, Continent, Population "
                            + "FROM country "
                            + "ORDER BY Population DESC";

            ResultSet results = db.query(query);
            ArrayList<Country> countries = new ArrayList<Country>();
            while (results.next()) {
                Country country = new Country();
                country.Code = results.getString("Code");
                country.Name = results.getString("Name");
                country.Population = results.getInt("Population");
                countries.add(country);
            }
            return countries;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get details");
            return null;
        }
    }

    /**
     * All the countries in a continent organised by largest population to smallest.
     *
     * @return
     */
    public ArrayList<Country> continentCountriesByPopulationLS() {
        return null;
    }

    /**
     * All the countries in a region organised by largest population to smallest.
     *
     * @return
     */
    public ArrayList<Country> regionCountriesByPopulationLS() {
        return null;
    }

    /**
     * The top N populated countries in the world where N is provided by the user.
     *
     * @return
     */
    public ArrayList<Country> worldCountriesTopN(int n) {
        return null;
    }

    /**
     * The top N populated countries in a continent where N is provided by the user.
     *
     * @return
     */
    public ArrayList<Country> continentCountriesTopN(int n) {
        return null;
    }

    /**
     * The top N populated countries in a region where N is provided by the user.
     *
     * @return
     */
    public ArrayList<Country> regionCountriesTopN(int n) {
        return null;
    }

    /**
     * All the cities in the world organised by largest population to smallest.
     *
     * @return
     */
    public ArrayList<City> worldCitiesByPopulationLS() {
        return null;
    }

    /**
     * All the cities in a continent organised by largest population to smallest.
     *
     * @return
     */
    public ArrayList<City> continentCitiesByPopulationLS() {
        return null;
    }

    /**
     * All the cities in a region organised by largest population to smallest.
     *
     * @return
     */
    public ArrayList<City> regionCitiesByPopulationLS() {
        return null;
    }

    /**
     * All the cities in a country organised by largest population to smallest.
     *
     * @return
     */
    public ArrayList<City> countryCitiesByPopulationLS() {
        return null;
    }

    /**
     * All the cities in a district organised by largest population to smallest.
     *
     * @return
     */
    public ArrayList<City> districtCitiesByPopulationLS() {
        return null;
    }

    /**
     * The top N populated cities in the world where N is provided by the user.
     *
     * @return
     */
    public ArrayList<City> worldCitiesTopN(int n) {
        return null;
    }

    /**
     * The top N populated cities in a continent where N is provided by the user.
     *
     * @return
     */
    public ArrayList<City> continentCitiesTopN(int n) {
        return null;
    }

    /**
     * The top N populated cities in a region where N is provided by the user.
     *
     * @return
     */
    public ArrayList<City> regionCitiesTopN(int n) {
        return null;
    }

    /**
     * The top N populated cities in a country where N is provided by the user.
     *
     * @return
     */
    public ArrayList<City> countryCitiesTopN(int n) {
        return null;
    }

    /**
     * The top N populated cities in a district where N is provided by the user.
     *
     * @return
     */
    public ArrayList<City> districtCitiesTopN(int n) {
        return null;
    }

    /**
     * All the capital cities in the world organised by largest population to smallest.
     *
     * @return
     */
    public ArrayList<City> worldCapitalsByPopulationLS() {
        return null;
    }

    /**
     * All the capital cities in a continent organised by largest population to smallest.
     *
     * @return
     */
    public ArrayList<City> continentCapitalsByPopulationLS() {
        return null;
    }

    /**
     * All the capital cities in a region organised by largest to smallest.
     *
     * @return
     */
    public ArrayList<City> regionCapitalsByPopulationLS() {
        return null;
    }

    /**
     * The top N populated capital cities in the world where N is provided by the user.
     *
     * @return
     */
    public ArrayList<City> worldCapitalsTopN(int n) {
        return null;
    }

    /**
     * The top N populated capital cities in a continent where N is provided by the user.
     *
     * @return
     */
    public ArrayList<City> continentCapitalsTopN(int n) {
        return null;
    }

    /**
     * The top N populated capital cities in a region where N is provided by the user.
     *
     * @return
     */
    public ArrayList<City> regionCapitalsTopN(int n) {
        return null;
    }

    /**
     * The population of people, people living in cities, and people not living in cities in each continent.
     *
     * @return
     */
    public ArrayList<City> continentPopulationCitiesandRural() {
        return null;
    }

    /**
     * The population of people, people living in cities, and people not living in cities in each region.
     *
     * @return
     */
    public ArrayList<City> regionPopulationCitiesandRural() {
        return null;
    }

    /**
     * The population of people, people living in cities, and people not living in cities in each country.
     *
     * @return
     */
    public ArrayList<City> countryPopulationCitiesandRural() {
        return null;
    }
}
