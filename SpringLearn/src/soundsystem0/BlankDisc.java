package soundsystem0;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;
	
//	public BlankDisc(
//			@Value("${disc.title}") String title, 
//			@Value("${disc.artist}") String artist) {
//		this.title = title;
//		this.artist = artist;
//	}
	
	public BlankDisc(
			@Value("#{systemProperties['disc.title']}") String title, 
			@Value("#{systemProperties['disc.artist']}") String artist) {
		this.title = title;
		this.artist = artist;
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
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
	}

}
