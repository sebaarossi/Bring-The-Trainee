package Java;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        RepoPlanets repoPlanets = RepoPlanets.getInstance();

        RepoTracks repoTracks = RepoTracks.getInstance();

        Permutator permutator = Permutator.getInstance();


        /* Interactivo
            String name = "p";
            Double cost;

            while (!name.equals("q")) {
                System.out.println("\nIngrese un planeta o 'q' para finalizar\n");
                name = reader.next();
                if (!name.equals("q")) {
                    repoPlanets.addPlanet(new Planet(name));
                }
            }

            for (int i = 0; i < repoPlanets.getPlanets().size(); i++)
                for (int j = 0; j < repoPlanets.getPlanets().size(); j++) {
                    if (i == j) {
                        repoPlanets.getPlanets().get(i).addPlanetTripPrice(repoPlanets.getPlanets().get(j), 0.0);
                    } else {
                        System.out
                                .println("\nIngrese el costo de ir desde " + repoPlanets.getPlanets().get(i).getName()
                                        + " hasta "
                                        + repoPlanets.getPlanets().get(j).getName());
                        cost = reader.nextDouble();
                        repoPlanets.getPlanets().get(i).addPlanetTripPrice(repoPlanets.getPlanets().get(j), cost);
                    }
                }
            
        */

        DataBatch.generateData();
        
        ArrayList<Planet> arr = repoPlanets.getPlanets();

        System.out.println(arr.size());

        repoTracks.setTracks(permutator.generatePermutations(arr));

        System.out.println(repoTracks.getTracks().size());
        
        Track minTrack = repoTracks.getTracks().get(0);

        for (Track track : repoTracks.getTracks()) {
            track.getTrack().add(track.getTrack().get(0));
            track.calculateCost();
            if (track.getCost() < minTrack.getCost()) {
                minTrack = track;
            }
        }

        for (int i = 0; i < repoTracks.getTracks().size(); i++) {
            repoTracks.getTracks().get(i).showTrack();
        }

        System.out.print("El recorrido más barato es ");
        minTrack.showTrack();
        reader.close();
    }
}
