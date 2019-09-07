package soundsystem0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

// 使用@Import导入
@Configuration
@Import(CDConfig.class)
@PropertySource("classpath:/com/soundsystem/app.properties")
public class CDPlayerConfig {

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
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}
	
	@Bean
	public CompactDisc sgtPeppers() {
		return new BlankDisc("sgt. pepper's Lonely Hearts Club Band", "The Beatles");
	}
}
