package com.myapp2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProductionProfileConfig {
	
	@Bean
	public CDPlayer dataSource() {
		return new CDPlayer("ProductionProfileConfig");
	}
	
	@Bean
	public String myName() {
		return "ProductionProfileConfig";
	}
}
