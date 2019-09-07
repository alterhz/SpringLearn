package soundsystemIOC;

import java.util.List;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;
	
	public BlankDisc() {

	}
	
	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		if (null != tracks) {
			for (String track : tracks) {
	            System.out.println("-Track: " + track);
	        }
		}
        
	}

}
