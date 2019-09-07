package soundsystem1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class TrackCounterConfig {
	
	@Bean
	public CompactDisc sgtPeppers() {
		BlackDisc cd = new BlackDisc();
		cd.setTitle("Sgt. pepper's Lonely Hearts Club Band");
		cd.setArtist("The Beatles");
		return cd;
	}
	
	@Bean
	@Primary
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}

}
