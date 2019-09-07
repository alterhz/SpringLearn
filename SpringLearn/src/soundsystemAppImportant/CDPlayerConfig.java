package soundsystemAppImportant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
	
//	@Bean(name="pepper")
	@Bean
	SgtPeppers sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	SgtPeppers sgtPeppers2() {
		return new SgtPeppers();
	}
	
	@Bean
	SgtPeppers sgtPeppers3() {
		return new SgtPeppers();
	}
	
	@Bean
	SgtPeppers sgtPeppers4() {
		return new SgtPeppers();
	}
	
	
}
