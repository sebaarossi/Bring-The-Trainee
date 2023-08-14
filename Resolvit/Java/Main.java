package Java;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        RepoPlanets repoPlanets = RepoPlanets.getInstance();

        RepoTracks repoTracks = RepoTracks.getInstance();

        Permutator permutator = Permutator.getInstance();

        DataBatch.generateData();

        ArrayList<Planet> arr = repoPlanets.getPlanets();

        // System.out.println(arr.size());

        repoTracks.setTracks(permutator.generatePermutations(arr));

        // System.out.println(repoTracks.getTracks().size());

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
