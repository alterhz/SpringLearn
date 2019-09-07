package soundsystemContextTest;

import org.springframework.aop.framework.AopContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TrackCounterConfig.class);
		
//		TestBean testBean = ctx.getBean("testBean", TestBean.class);
//		testBean.test();
	
		CompactDisc compactDisc = ctx.getBean("blackDisc", BlackDisc.class);
		compactDisc.playTrack(1);
		compactDisc.playTrack(1);
		compactDisc.playTrack(2);
		compactDisc.playTrack(3);
		compactDisc.playTrack(3);
		compactDisc.playTrack(3);
		compactDisc.playTrack(3);
		compactDisc.playTrack(7);
		compactDisc.playTrack(7);
		
//		;
		
		TrackCounter trackCounter = (TrackCounter)AopContext.currentProxy();
		
		for (int i=1; i<=7; ++i) {
			int count = trackCounter.getPlayCount(i);
			System.out.println(i + " : " + count);
		}
	}

}
