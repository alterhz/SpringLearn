package soundsystem0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	
	@Autowired(required = false)
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	@Autowired
	public void insertDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	@Override
	public void play() {
		cd.play();
	}
}
