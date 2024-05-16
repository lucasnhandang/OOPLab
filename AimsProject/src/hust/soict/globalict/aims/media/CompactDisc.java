package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
    }

    public String getArtist() {
        return artist;
    }
    public CompactDisc(int id, String title, String category, float cost, String director, String artist,
                       List<Track> tracks) {
        super(id, title, category, cost, 0, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String artist, List<Track> tracks) {
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(int id, String title, String category, float cost, String artist) {}

    public void addTrack (Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }

    public void removeTrack (Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        }
    }

    public int getLength () {
        int len = 0;
        for (Track track : tracks) {
            len += track.getLength();
        }
        return len;
    }

    public String toString() {
        return "CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getArtist() + " - " + this.getLength() + " - " + this.getCost() + "$";
    }

    @Override
    public void play() {
        for (Track track : tracks) {
            track.play();
        }
    }
}
