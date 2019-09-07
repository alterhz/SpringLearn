package com.myapp2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevelopmentProfileConfig {
	
	@Bean
	public CDPlayer dataSource() {
		return new CDPlayer("DevelopmentProfileConfig");
	}
	
	@Bean
	public String myName() {
		return "DevelopmentProfileConfig";
	}
}
