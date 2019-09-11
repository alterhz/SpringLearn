package soundsystemValue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan
public class CDPlayerConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer sourcePalceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	@Bean
//	@Primary
//	public BlackDisc disc(@Value("abc") String title, 
//			@Value("tom") String artist) {
//		return new BlackDisc(title, artist);
//	}
}
