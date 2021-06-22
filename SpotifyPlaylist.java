/**
 *  A class SpotifyPlaylist that contains 1000 songs
 *
 * @author (Paolo Ciaramitaro)
 * @version (6/21/21)
 */
public class SpotifyPlaylist
{
    private int first;
    private Song[] playlist = new Song[1000];

    /**
     * Empty Constructor for objects of class SpotifyPlaylist
     */
    public SpotifyPlaylist()
    {
        first = 0;
    }

    /**
     * This method adds a song to the playlist
     */
    public boolean addSong(Song song){
        if(first >= playlist.length)
            return false;
        
        playlist[first++] = song;
        return true;
    }

    /**
     * Prints out all the songs in the playlist
     */
    public void printSongs(){
        for(int i = 0; i < first; i++)
            System.out.println(playlist[i].getTitle());
        
    }

    /**
     * Prints all songs from a specific album
     * @param String
     */
    public void printSongsOnAlbum(String album){
        for(int i = 0; i < first; i++){
            if(playlist[i].getAlbum().equals(album))
                System.out.println(playlist[i].getTitle());
            
        }
    }

    /**
     * This prints out all songs from a specific genre
     * @param String
     */
    public void printSongsOfGenre(String genre){
        for(int i = 0; i < first; i++){
            if(playlist [i].getMusicGenre().equals(genre))
                System.out.println(playlist[i].getTitle());
            
        }
    }

    /**
     * This prints out all songs by a given artist
     * @param String
     */

    public void printSongsOfArtist(String artist){
        for(int i = 0; i < first; i++){
            if(playlist[i].getArtist().equals(artist))
                System.out.println(playlist[i].getTitle());
            
        }
    }

    /**
     * This plays a song 
     * @param String
     */
    public void play(String title){
        for(int i = 0; i < first; i++){
            if(playlist[i].getTitle().equals(title))
                playlist[i].setNumOfPlays(playlist[i].getNumOfPlays()
                + 1);
            
        }
    }

    /**
     * This removes a song
     * @param String
     */
    public void remove(String title){
        for(int i = 0; i < first; i++){
            if(playlist[i].getTitle().equals(title)){
                playlist[i] = null;
                for(int n = i; n < playlist.length-1 ; n++){
                    playlist[n] = playlist[n+1];
                    playlist[i] = playlist[n];
                }
            }
        }
        first -= 1;
    }
    /**
     * Contains a method that prints the top 10 songs
     * 
     */
    public void printTop10(){
         Song[] top10 = new Song[10];
        int ind = 0;
        int x;
        int y;
        int i = 1;
        Song val;
        Song val2;
        top10[0] = playlist[0];
        while (playlist[i] != null) {
            ind = 10;
            x = 9;
            while(x >= 0) {
                if(top10[x] != null) {
                    if (playlist[i].getNumOfPlays() >
                    top10[x].getNumOfPlays()) {
                        ind = x;
                    }
                    else {
                        x = -1;
                    }
                }
                else {
                    ind = x;
                }
                x = x -1;
            }
            if (ind < 10) {
                val = playlist[i];
                for(y = ind; y <= 9; y++) {
                    val2 = top10[y];
                    top10[y] = val;
                    val = val2;
                }
            }
            i++;
        }
        int sumNum = 1;
        for (Song s : top10) {
            System.out.println (sumNum + " - " + s.getTitle());
            sumNum++;
        }
    }
    
}