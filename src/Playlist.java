public class Playlist {
    private Song first;
    private Song last;
    private int len;

    public Playlist() {
        this.first = null;
        this.last = null;
        this.len = 0;
    }

    // Method to add a new song to the playlist
    public void addSong(String name, String artist, String album) {
        Song newSong = new Song(name, artist, album);
        if (first == null) {
            first = newSong;
            last = newSong;
            len = 1;
        } else {
            last.setNextTrack(newSong);
            newSong.setPreviousTrack(last);
            last = newSong;
            len++;
        }
        newSong.setPosition(len);
    }

    // Method to remove one song of the playlist
    public void removeSong(String name) {
        Song current = first;

        while (current != null) {
            if (current.getName().equals(name)) {
                if (current.getPreviousTrack() != null) {
                    current.getPreviousTrack().setNextTrack(current.getNextTrack());
                } else {
                    first = current.getNextTrack();
                }

                if (current.getNextTrack() != null) {
                    current.getNextTrack().setPreviousTrack(current.getPreviousTrack());
                } else {
                    last = current.getPreviousTrack();
                }
                len--;
                current = first;
                int newPosition = 1;
                while (current != null) {
                    current.setPosition(newPosition);
                    current = current.getNextTrack();
                    newPosition++;
                }
                return; // The song was deleted
            }
            current = current.getNextTrack();
        }

        System.out.println("The song '" + name + "' hasn't been found in this Playlist.");
    }

    public void removeSongByPosition(int position) {
        Song current = first;

        while (current != null) {
            if (current.getPosition() == position) {
                if (current.getPreviousTrack() != null) {
                    current.getPreviousTrack().setNextTrack(current.getNextTrack());
                } else {
                    first = current.getNextTrack();
                }

                if (current.getNextTrack() != null) {
                    current.getNextTrack().setPreviousTrack(current.getPreviousTrack());
                } else {
                    last = current.getPreviousTrack();
                }
                len--;
                current = first;
                int newPosition = 1;
                while (current != null) {
                    current.setPosition(newPosition);
                    current = current.getNextTrack();
                    newPosition++;
                }
                return; // The song was deleted
            }
            current = current.getNextTrack();
        }

        System.out.println("The song in the position '" + position + "' hasn't been found in this Playlist.");
    }

    public void searchSong(String name) {
        Song current = first;

        while (current != null) {
            if (current.getName().equals(name)) {
                System.out.println("We have found this Title: " + current.getName() +
                        ", artist: " + current.getArtist() +
                        ", album: " + current.getAlbum() +
                        ", position: " + current.getPosition());
                return; // The song was deleted
            }
            current = current.getNextTrack();
        }

        System.out.println("The song in the name '" + name + "' hasn't been found in this Playlist.");
    }

    public void searchSongByPosition(int position) {
        Song current = first;

        while (current != null) {
            if (current.getPosition() == position) {
                System.out.println("We have found this Title: " + current.getName() +
                        ", artist: " + current.getArtist() +
                        ", album: " + current.getAlbum() +
                        ", position: " + current.getPosition());
                return; // The song was deleted
            }
            current = current.getNextTrack();
        }

        System.out.println("The song in the position '" + position + "' hasn't been found in this Playlist.");
    }

    // Method to show all the songs of the playlist
    public void seeEachSong() {
        Song current = first;
        while (current != null) {
            System.out.println("Title: " + current.getName() +
                    ", artist: " + current.getArtist() +
                    ", album: " + current.getAlbum() +
                    ", position: " + current.getPosition());
            current = current.getNextTrack();
        }
    }

    // Method to get the length of the playlist
    public void getLen() {
        if (len == 1) {
            System.out.println("There is " + len + " song.");
        } else {
            System.out.println("There are " + len + " songs.");
        }
    }

    public void concatenatePlaylist(Playlist playlist2) {
        last.setNextTrack(playlist2.getFirst());
        playlist2.getFirst().setPreviousTrack(last);
        last = playlist2.getLast();

        Song current = first;
        int newPosition = 1;
        while (current != null) {
            current.setPosition(newPosition);
            current = current.getNextTrack();
            newPosition++;
        }
        len = newPosition - 1;
    }

    public Song getFirst() {
        return first;
    }

    public Song getLast() {
        return last;
    }

    public void replaceSong(int idSong, String name, String artist, String album){
        Song newSong = new Song(name, artist, album);
        Song current = first;
        while (current != null) {
            if (current.getPosition() == idSong) {
                newSong.setPreviousTrack(current.getPreviousTrack());
                newSong.setNextTrack(current.getNextTrack());
                if (current.getPreviousTrack() != null) {
                    current.getPreviousTrack().setNextTrack(newSong);
                } else {
                    first = newSong;
                }

                if (current.getNextTrack() != null) {
                    current.getNextTrack().setPreviousTrack(newSong);
                } else {
                    last = newSong;
                }

                current = first;
                int newPosition = 1;
                while (current != null) {
                    current.setPosition(newPosition);
                    current = current.getNextTrack();
                    newPosition++;
                }
                return; // The song was replaced
            }
            current = current.getNextTrack();
        }
    }

}