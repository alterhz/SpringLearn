package concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConertTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext();
		Performance performance = context.getBean("Performance", Performance.class);
		
		performance.perform();
		
		
		
	}
}
