public class Playlist {
    private String name;
    private Song firstSong;
    private Song lastSong;

    public Playlist(String name) {
        this.name = name;
        System.out.println("\nThe playlist '" + name + "' has been created.");
    }
}
