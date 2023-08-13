package Java;

import java.util.ArrayList;

public class Permutator {

    private static Permutator INSTANCE;

    private Permutator() {
    }

    public static Permutator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Permutator();
        }
        return INSTANCE;
    }

    public ArrayList<Track> generatePermutations(ArrayList<Planet> planets) {
        ArrayList<Track> permutations = new ArrayList<>();
        generatePermutations(new ArrayList<>(planets), new ArrayList<>(), permutations);
        return permutations;
    }

    private void generatePermutations(ArrayList<Planet> remaining, ArrayList<Planet> currentPermutation,
            ArrayList<Track> permutations) {
        if (remaining.isEmpty()) {
            permutations.add(new Track(new ArrayList<>(currentPermutation)));
            return;
        }

        for (int i = 0; i < remaining.size(); i++) {
            Planet planet = remaining.get(i);
            currentPermutation.add(planet);
            ArrayList<Planet> newRemaining = new ArrayList<>(remaining);
            newRemaining.remove(i);
            generatePermutations(newRemaining, currentPermutation, permutations);
            currentPermutation.remove(currentPermutation.size() - 1);
        }
    }
}
