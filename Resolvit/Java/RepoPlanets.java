package Java;

import java.util.ArrayList;

public final class RepoPlanets {

    private static RepoPlanets INSTANCE;

    private RepoPlanets() {
    }

    public static RepoPlanets getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RepoPlanets();
        }

        return INSTANCE;
    }

    private ArrayList<Planet> planets = new ArrayList<Planet>();

    // Getters

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    // Setters

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    // Methods

    public void addPlanet(Planet planet) {
        this.planets.add(planet);
    }

}