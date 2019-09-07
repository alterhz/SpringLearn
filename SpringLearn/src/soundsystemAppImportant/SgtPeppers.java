package soundsystemAppImportant;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("compactDisc")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Primary
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	private static int allocId = 0;
	private int id = 0;
	
	public SgtPeppers() {
		this.id = ++allocId;
	}
	
	@Override
	public void play() {
		System.out.println("[" + id + "]Playing " + title + " by " + artist);
	}

	public int getId() {
		return id;
	}

}
