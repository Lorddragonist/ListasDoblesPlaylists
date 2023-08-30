public class Main {
    public static void main(String[] args) {
        Playlist metallica80s = new Playlist();

        metallica80s.addSong("Master of Puppets", "Metallica");
        metallica80s.addSong("Welcome Home (Sanitarium)", "Metallica");
        metallica80s.addSong("One", "Metallica");

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


    }

}
