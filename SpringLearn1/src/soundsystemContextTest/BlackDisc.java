package soundsystemContextTest;

public class BlackDisc implements CompactDisc {
	
	private String title = "";
	private String artist = "";
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public void playTrack(int trackNumber) {
		System.out.println("track " + trackNumber + " play.");
	}
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
