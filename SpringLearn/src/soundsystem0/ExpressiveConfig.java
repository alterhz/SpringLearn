package soundsystem0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/com/soundsystem/app.properties")
public class ExpressiveConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	public BlankDisc disc() {
		return new BlankDisc(
				env.getProperty("disc.title"),
				env.getProperty("disc.artist")
				);
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer sourcePalceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public static PropertyPlaceholderConfigurer palceholderConfigurer() {
		return new PropertyPlaceholderConfigurer();
	}
}
