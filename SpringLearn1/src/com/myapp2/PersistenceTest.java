package com.myapp2;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {PersistenceTestConfig.class, 
		ProductionProfileConfig.class, 
		DevelopmentProfileConfig.class})
@ActiveProfiles("dev")
public class PersistenceTest {
	
	@Autowired
	private CDPlayer dataSource;
	
	@Autowired(required=false)
	private CDPlayer2 embeddedDataSource;
	
	@Autowired(required=false)
	private CDPlayer2 jndiDataSource;
	
	@Autowired
	private String myName;
	
	@Test
	public void testString() {
		assertNotNull(myName);
	}
	
	@Test
	public void testDataSource() {
		assertNotNull(dataSource);
	}
	
	@Test
	public void testembeddedDataSource() {
		assertNotNull(embeddedDataSource);
	}
	
	@Test
	public void jndiDataSource() {
		assertNotNull(jndiDataSource);
	}
	
}
