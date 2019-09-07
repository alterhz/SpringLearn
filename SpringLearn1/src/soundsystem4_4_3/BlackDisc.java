package soundsystem4_4_3;

public class BlackDisc implements CompactDisc {
	
	private String title = "";
	private String artist = "";
	
	@Override
	public void playTrack(int trackNumber) {
		System.out.println("track " + trackNumber + " play.");
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}
}
