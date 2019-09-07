package soundsystemApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		
		SgtPeppers SgtPeppers = ctx.getBean("pepper", SgtPeppers.class);
		SgtPeppers.play();
		
		CdPlayer cdPlayer = ctx.getBean("mediaPlayer", CdPlayer.class);
		cdPlayer.play();
	
	}
}
