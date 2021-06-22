/**
 * A song class that can fill in the information for a song
 *
 * @author (Paolo Ciaramitaro)
 * @version (6/21/21)
 */
public class Song
{
    // Fields
    private String title;
    private String artist;
    private String album;
    private double songLengthSec; 
    private String musicGenre;
    private int numOfPlays;

    // Constructors
    /**
     * Empty Constructor for objects of class Song
     */
    public Song() {
    }

    /**
     * Overloaded Constructor for objects of class Song
     */
    public Song(String title, String artist, String album, double songLengthSec, String genre, int numOfPlays) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.songLengthSec = songLengthSec;
        this.musicGenre = musicGenre;
        this.numOfPlays = numOfPlays;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public double getSongLengthSec() {
        return songLengthSec;
    }

    public String getMusicGenre () {
        return musicGenre;
    }

    public int getNumOfPlays() {
        return numOfPlays;
    }

    // Setters
    public void setTitle (String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setSongLengthSec(double songLengthSec) {
        this.songLengthSec = songLengthSec;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public void setNumOfPlays(int numOfPlays) {
        this.numOfPlays = numOfPlays;
    }

    // Methods
    /**
     * toString of the info of the class Song
     * @return a toString representation of the Song class
     */
    public String toString() {
        String s = "Song: ";
        s = s + "Title: " +  getTitle() + " ";
        s = s + "Artist: " + getArtist() + " ";
        s = s + "Name of album: " + getAlbum() + " ";
        s = s + "Length of song: " + getSongLengthSec() + " ";
        s = s + "Genre of song: " + getMusicGenre() + " ";
        s = s + "Number of time played: " + getNumOfPlays() + " ";
        return s;
    }

    /**
     * A method that replays/repeats a song
     */
    public void rePlay() {
        numOfPlays = numOfPlays + 1;
    }
    
    
}