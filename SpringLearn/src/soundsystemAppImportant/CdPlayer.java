package soundsystemAppImportant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mediaPlayer")
@Primary
public class CdPlayer implements MediaPlayer {
	
	private CompactDisc cd;
	
	public CdPlayer() {
		
	}
	
	@Autowired(required = false)
	public CdPlayer(CompactDisc cd) {
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
		if (null != cd) {
			cd.play();
		}
	}
}
