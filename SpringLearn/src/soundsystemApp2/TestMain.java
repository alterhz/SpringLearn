package soundsystemApp2;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class TestMain {

	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		
		
		CDPlayer cdPlayer = beanFactory.getBean("CDPlayer", CDPlayer.class);
		cdPlayer.play();
		
	}
}
