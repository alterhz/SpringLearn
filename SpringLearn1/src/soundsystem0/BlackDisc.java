package soundsystem0;

import org.springframework.stereotype.Component;

@Component
public class BlackDisc implements CompactDisc {
	
	private String title = "";
	private String artist = "";
	
	public BlackDisc() {
	}
	
	public BlackDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
//	public BlackDisc(
//			@Value("abc") String title, 
//			@Value("tom") String artist) {
//		this.title = title;
//		this.artist = artist;
//	}
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
