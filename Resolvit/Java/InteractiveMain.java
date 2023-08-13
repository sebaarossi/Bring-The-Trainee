package Java;

import java.util.*;

public class InteractiveMain {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        RepoPlanets repoPlanets = RepoPlanets.getInstance();

        RepoTracks repoTracks = RepoTracks.getInstance();

        Permutator permutator = Permutator.getInstance();

        String name = "p";
        Double cost;

        while (!name.equals("q")) {
            System.out.println("\nInsert a planet or 'q' to conitnue\n");
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
                            .println("\nEnter the cost of going from " +
                                    repoPlanets.getPlanets().get(i).getName()
                                    + " to "
                                    + repoPlanets.getPlanets().get(j).getName());
                    cost = reader.nextDouble();
                    repoPlanets.getPlanets().get(i).addPlanetTripPrice(repoPlanets.getPlanets().get(j), cost);
                }
            }

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

        System.out.print("The cheapest track is: ");
        minTrack.showTrack();
        reader.close();
    }
}