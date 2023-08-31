public class Main {
    public static void main(String[] args) {
        Playlist metallica80s = new Playlist();

        metallica80s.addSong("Master of Puppets", "Metallica" , "Master of Puppets");
        metallica80s.addSong("Welcome Home (Sanitarium)", "Metallica", "Master of Puppets");
        metallica80s.addSong("One", "Metallica", "And Justice For All");
        metallica80s.addSong("Fade to Black", "Metallica", "Ride the Lightning");


        System.out.println("The playlist: Metallica80s has been created, these are the songs that you have added:" );
        metallica80s.seeEachSong();
        metallica80s.getLen();

        metallica80s.searchSongByPosition(3);

        metallica80s.removeSong("Welcome Home (Sanitarium)");
        System.out.println("\nThe song 'Welcome Home (Sanitarium)' was removed from the playlist, these are its remaining songs:");
        metallica80s.seeEachSong();
        metallica80s.getLen();

        metallica80s.removeSongByPosition(1);
        System.out.println("\nThe song in the position '1' was removed from the playlist, these are its remaining songs:");
        metallica80s.seeEachSong();
        metallica80s.getLen();

        Playlist metallica90s = new Playlist();

        metallica90s.addSong("Wherever I May Roam", "Metallica" , "Metallica");
        metallica90s.addSong("Enter Sandman", "Metallica", "Metallica");
        metallica90s.addSong("Bleeding Me", "Metallica", "Load");
        metallica90s.addSong("Sad but True", "Metallica", "Metallica");


        System.out.println("\nThe playlist: Metallica90s has been created, these are the songs that you have added:" );
        metallica90s.seeEachSong();
        metallica90s.getLen();

        Playlist metallica80and90s = metallica80s;
        System.out.println("\nThe playlist: Metallica80and90s has been created, these are the songs that you have added:" );
        metallica80and90s.concatenatePlaylist(metallica90s);
        metallica80and90s.seeEachSong();
        metallica80and90s.getLen();

    }

}
