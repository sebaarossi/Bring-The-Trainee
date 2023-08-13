package Java;

import java.util.ArrayList;

public class Track {

    private ArrayList<Planet> track = new ArrayList<>();

    private Double cost;

    // Constructor

    public Track() {

    }

    public Track(ArrayList<Planet> track) {
        this.track = track;
    }

    // Getters

    public ArrayList<Planet> getTrack() {
        return track;
    }

    public Double getCost() {
        return cost;
    }

    // Setters

    public void setTrack(ArrayList<Planet> track) {
        this.track = track;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    // Methods

    public void calculateCost() {
        Double cost = 0.0;
        for (int i = 0; i < track.size() - 1; i++) {
            cost += track.get(i).costTo(track.get(i + 1));
        }
        cost += track.get(track.size() - 1).costTo(track.get(0));
        this.setCost(cost);
    }

    public void showTrack() {

        System.out.print("[ ");
        for (int j = 0; j < track.size(); j++) {
            System.out.print(track.get(j).getName() + " ");
        }
        System.out.print("] -> Total cost: ");
        System.out.println(cost);

    }

}
