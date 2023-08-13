package Java;

public class DataBatch {

    public static void generateData() {

        // Planet creation

        Planet planet1 = new Planet("Mercury");
        RepoPlanets.getInstance().getPlanets().add(planet1);
        Planet planet2 = new Planet("Venus");
        RepoPlanets.getInstance().getPlanets().add(planet2);
        Planet planet3 = new Planet("Earth");
        RepoPlanets.getInstance().getPlanets().add(planet3);
        Planet planet4 = new Planet("Mars");
        RepoPlanets.getInstance().getPlanets().add(planet4);

        // Trip Prices

        // Mercurio
        planet1.addPlanetTripPrice(planet1, 0.0);
        planet1.addPlanetTripPrice(planet2, 1.0);
        planet1.addPlanetTripPrice(planet3, 10.0);
        planet1.addPlanetTripPrice(planet4, 4.0);

        // Venus
        planet2.addPlanetTripPrice(planet1, 8.0);
        planet2.addPlanetTripPrice(planet2, 0.0);
        planet2.addPlanetTripPrice(planet3, 7.0);
        planet2.addPlanetTripPrice(planet4, 12.0);

        // Tierra
        planet3.addPlanetTripPrice(planet1, 9.0);
        planet3.addPlanetTripPrice(planet2, 4.0);
        planet3.addPlanetTripPrice(planet3, 0.0);
        planet3.addPlanetTripPrice(planet4, 11.0);

        // Marte
        planet4.addPlanetTripPrice(planet1, 15.0);
        planet4.addPlanetTripPrice(planet2, 6.0);
        planet4.addPlanetTripPrice(planet3, 18.0);
        planet4.addPlanetTripPrice(planet4, 0.0);

    }
}
