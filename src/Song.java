class Song {
    private final String name;
    private final String artist;
    private Song nextTrack;
    private Song previousTrack;
    private int position;

    public Song(String title, String artist) {
        this.name = title;
        this.artist = artist;
        this.nextTrack = null;
        this.previousTrack = null;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }
    public Song getNextTrack() {
        return nextTrack;
    }

    public void setNextTrack(Song nextTrack) {
        this.nextTrack = nextTrack;
    }

    public Song getPreviousTrack() {
        return previousTrack;
    }

    public void setPreviousTrack(Song previousTrack) {
        this.previousTrack = previousTrack;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}