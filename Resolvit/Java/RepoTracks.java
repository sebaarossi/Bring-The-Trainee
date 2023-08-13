package Java;

import java.util.ArrayList;

public class RepoTracks {

    private static RepoTracks INSTANCE;

    private RepoTracks() {
    }

    public static RepoTracks getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RepoTracks();
        }

        return INSTANCE;
    }

    private ArrayList<Track> tracks;

    // Getters

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    // Setters

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    // Methods
    public void addTrack(Track track) {
        this.tracks.add(track);
    }

}
