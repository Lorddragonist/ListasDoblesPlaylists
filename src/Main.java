import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to your Music Player");


        int optionMenu1;
        Scanner scanner = new Scanner(System.in);
        Scanner listName = new Scanner(System.in);
        String menu1 = """
                                
                Please chose one of the following options:
                        
                """;

        String[] options = {"1. Create Playlist.", "2. Seach a song.", "3. See playlists.", "4. Exit\n"};

        do {


            System.out.println(menu1);

            for (int i = 0; i < options.length; i++) {
                System.out.println(options[i]);
            }

            optionMenu1 = scanner.nextInt();
            System.out.println(options[optionMenu1 - 1]);

            switch (optionMenu1) {
                case 1:
                    System.out.println("\nWhat would be the playlist name?");

                    String playListName = listName.nextLine();

                    createPlaylist(playListName);
                    break;
                case 2:
                    System.out.println("\nWhat song would you like to search?");
                    String songName = listName.nextLine();

                    searchSong(songName);
                    break;
                default:
                    break;
            }

        } while (optionMenu1 != 4);

    }

    public static void createPlaylist(String playlistName) {
        Playlist playlist = new Playlist(playlistName);
    }

    public static void searchSong(String songName) {
        Song song = new Song(songName);
    }

}