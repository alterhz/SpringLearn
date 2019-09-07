package com.myapp2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PersistenceTestConfig {
	
	@Bean
	@Profile("dev")
	public CDPlayer2 embeddedDataSource() {
		return new CDPlayer2("embeddedDataSource");
	}
	
	@Bean
	@Profile("prod")
	public CDPlayer2 jndiDataSource() {
		return new CDPlayer2("jndiDataSource");
	}
}
