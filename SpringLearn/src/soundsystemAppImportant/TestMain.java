package soundsystemAppImportant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		
		SgtPeppers SgtPeppers = ctx.getBean("compactDisc", SgtPeppers.class);
		SgtPeppers.play();
		
		CdPlayer cdPlayer = ctx.getBean("mediaPlayer", CdPlayer.class);
		cdPlayer.play();
		
		CdPlayer cdPlayer2 = ctx.getBean("mediaPlayer", CdPlayer.class);
		cdPlayer2.play();
	
	}
}
