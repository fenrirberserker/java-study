package concepts.mapping;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapping {

    public static void main(String[] args) {
        // Create a music collection with more data
        MusicCollection musicCollection = new MusicCollection(createGenres());

        // FlatMap to extract all track titles from the music collection
        List<String> allTrackTitles = musicCollection.getGenres().stream()
                .flatMap(genre -> genre.getArtists().stream())
                .flatMap(artist -> artist.getAlbums().stream())
                .flatMap(album -> album.getTracks().stream())
                .map(track -> String.format("Genre: %s, Artist: %s, Album: %s, Track: %s",
                        track.getAlbum().getArtist().getGenre().getName(),
                        track.getAlbum().getArtist().getName(),
                        track.getAlbum().getTitle(),
                        track.getTitle()))
                .collect(Collectors.toList());

        // Print all track titles with their full hierarchy info
        allTrackTitles.forEach(System.out::println);

        System.out.println("\nTracks played more than 100 times:");

        // Filter and list tracks played more than 100 times
        List<Track> popularTracks = musicCollection.getGenres().stream()
                .flatMap(genre -> genre.getArtists().stream())
                .flatMap(artist -> artist.getAlbums().stream())
                .flatMap(album -> album.getTracks().stream())
                .filter(track -> track.getPlaybackCount() > 100)
                .collect(Collectors.toList());

        // Print all popular tracks played more than X times
        popularTracks.forEach(track -> System.out.printf(
                "Genre: %s, Artist: %s, Album: %s, Track: %s, Playback Count: %d%n",
                track.getAlbum().getArtist().getGenre().getName(),
                track.getAlbum().getArtist().getName(),
                track.getAlbum().getTitle(),
                track.getTitle(),
                track.getPlaybackCount()));
    }

    // Method to create a list of genres with artists, albums, and tracks
    private static List<Genre> createGenres() {
        // Create tracks
        Track track1 = new Track("Track A1", 3.50, 120);
        Track track2 = new Track("Track A2", 4.20, 80);
        Track track3 = new Track("Track B1", 2.45, 150);
        Track track4 = new Track("Track B2", 5.10, 40);
        Track track5 = new Track("Track C1", 4.30, 200);
        Track track6 = new Track("Track C2", 5.00, 300);

        // Create albums
        Album album1 = new Album("Album 1", Arrays.asList(track1, track2));
        Album album2 = new Album("Album 2", Arrays.asList(track3, track4));
        Album album3 = new Album("Album 3", Arrays.asList(track5, track6));

        // Create artists
        Artist artist1 = new Artist("Artist 1", Arrays.asList(album1), "Rock");
        Artist artist2 = new Artist("Artist 2", Arrays.asList(album2), "Jazz");
        Artist artist3 = new Artist("Artist 3", Arrays.asList(album3), "Pop");

        // Assign albums to their artists and tracks to their albums
        album1.setArtist(artist1);
        album2.setArtist(artist2);
        album3.setArtist(artist3);
        track1.setAlbum(album1);
        track2.setAlbum(album1);
        track3.setAlbum(album2);
        track4.setAlbum(album2);
        track5.setAlbum(album3);
        track6.setAlbum(album3);

        // Create genres
        Genre genre1 = new Genre("Rock", Arrays.asList(artist1));
        Genre genre2 = new Genre("Jazz", Arrays.asList(artist2));
        Genre genre3 = new Genre("Pop", Arrays.asList(artist3));

        return Arrays.asList(genre1, genre2, genre3);
    }
}

// Class representing a music collection with genres
class MusicCollection {
    private List<Genre> genres;

    public MusicCollection(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Genre> getGenres() {
        return genres;
    }
}

// Class representing a music genre with artists
class Genre {
    private String name;
    private List<Artist> artists;

    public Genre(String name, List<Artist> artists) {
        this.name = name;
        this.artists = artists;
    }

    public String getName() {
        return name;
    }

    public List<Artist> getArtists() {
        return artists;
    }
}

// Class representing an artist with albums and genre
class Artist {
    private String name;
    private List<Album> albums;
    private Genre genre;

    public Artist(String name, List<Album> albums, String genreName) {
        this.name = name;
        this.albums = albums;
        this.genre = new Genre(genreName, Collections.singletonList(this));
    }

    public String getName() {
        return name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public Genre getGenre() {
        return genre;
    }
}

// Class representing an album with tracks and its artist
class Album {
    private String title;
    private List<Track> tracks;
    private Artist artist;

    public Album(String title, List<Track> tracks) {
        this.title = title;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }
}

// Class representing a track with a title, duration, and playback count
class Track {
    private String title;
    private double duration;
    private int playbackCount;
    private Album album;

    public Track(String title, double duration, int playbackCount) {
        this.title = title;
        this.duration = duration;
        this.playbackCount = playbackCount;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public int getPlaybackCount() {
        return playbackCount;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }
}
