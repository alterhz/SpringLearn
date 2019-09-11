package soundsystemValue;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
//	public SgtPeppers(String title, String artist) {
//		this.title = title;
//		this.artist = artist;
//	}
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
