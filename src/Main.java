public class Main {
    public static void main(String[] args) {

        System.out.println("""
                                
                CREATE A NEW PLAYLIST1 CALLED Metallica80s
                                
                """);
        Playlist metallica80s = new Playlist();

        System.out.println("""
                                
                ADDING 4 SONGS AND PRINT LENGTH
                                
                """);

        metallica80s.addSong("Master of Puppets", "Metallica", "Master of Puppets");
        metallica80s.addSong("Welcome Home (Sanitarium)", "Metallica", "Master of Puppets");
        metallica80s.addSong("One", "Metallica", "And Justice For All");
        metallica80s.addSong("Fade to Black", "Metallica", "Ride the Lightning");


        System.out.println("The playlist: Metallica80s has been created, these are the songs that you have added:");
        metallica80s.seeEachSong();
        metallica80s.getLen();

        System.out.println("""    
                            
                SEARCH SONG POSITION 3
                                
                """);

        metallica80s.searchSongByPosition(3);

        System.out.println("""
                                
                REMOVE BY NAME 'Welcome Home (Sanitarium)'
                                
                """);

        metallica80s.removeSong("Welcome Home (Sanitarium)");
        System.out.println("\nThe song 'Welcome Home (Sanitarium)' was removed from the playlist, these are its remaining songs:");
        metallica80s.seeEachSong();
        metallica80s.getLen();

        System.out.println("""
                                
                REMOVE POSITION 1
                                
                """);

        metallica80s.removeSongByPosition(1);
        System.out.println("\nThe song in the position '1' was removed from the playlist, these are its remaining songs:");
        metallica80s.seeEachSong();
        metallica80s.getLen();

        System.out.println("""
                                
                CREATE A SECOND PLAYLIST CALLED Metallica90s ADD 4 SONGS AND PRINT LENGTH
                                
                """);

        Playlist metallica90s = new Playlist();

        metallica90s.addSong("Wherever I May Roam", "Metallica", "Metallica");
        metallica90s.addSong("Enter Sandman", "Metallica", "Metallica");
        metallica90s.addSong("Bleeding Me", "Metallica", "Load");
        metallica90s.addSong("Sad but True", "Metallica", "Metallica");

        System.out.println("\nThe playlist: Metallica90s has been created, these are the songs that you have added:");
        metallica90s.seeEachSong();
        metallica90s.getLen();

        System.out.println("""
                                
                CREATE A THIRD LIST TO CONCATENATE THE PREVIOUS 2 PLAYLISTS
                                
                """);

        Playlist metallica80and90s = metallica80s;
        System.out.println("\nThe playlist: Metallica80and90s has been created, these are the songs that you have added:");
        metallica80and90s.concatenatePlaylist(metallica90s);
        metallica80and90s.seeEachSong();
        metallica80and90s.getLen();

        System.out.println("""
                                
                SEARCH IF THERE IS 'Bleeding Me' IN THE NEW PLAYLIST
                                
                """);

        metallica80and90s.searchSong("Bleeding Me");

        System.out.println("""
                                
                REPLACE position 6 WITH 'Fuel'
                                
                """);

        metallica80and90s.replaceSong(6, "Fuel", "Metallica", "Load");
        metallica80and90s.seeEachSong();
        metallica80and90s.getLen();

    }

}
