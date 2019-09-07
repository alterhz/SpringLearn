package com.C3_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DessertConfig {
	
	Dessert dessert;
	
	@Autowired
	@Cold
	@Creamy
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	@Bean
	@Qualifier("cold")
	public Dessert iceCream() {
		return new IceCream();
	}
}
