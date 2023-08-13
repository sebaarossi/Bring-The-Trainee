package Java;

import java.util.HashMap;

public class Planet {

    private String name;

    private HashMap<Planet, Double> tripPrices;

    // Constructor

    public Planet(
            String _nombre) {
        this.name = _nombre;
        this.tripPrices = new HashMap<>();
    }

    // Getters

    public String getName() {
        return name;
    }

    public HashMap<Planet, Double> getTripPrices() {
        return tripPrices;
    }

    // Setters

    public void setTripPrices(HashMap<Planet, Double> tripPrices) {
        this.tripPrices = tripPrices;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    // Methods

    public void addPlanetTripPrice(Planet planet, Double tripPrice) {

        this.tripPrices.put(planet, tripPrice);
    }

    public Double costTo(Planet planet) {
        return tripPrices.get(planet);
    }

}