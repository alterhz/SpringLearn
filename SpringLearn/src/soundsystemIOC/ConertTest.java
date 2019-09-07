package soundsystemIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConertTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("soundsystemIOC/ss.xml");
		BlankDisc blankDisc = context.getBean("compactDisc", BlankDisc.class);
		blankDisc.play();
		
		
	}
}
