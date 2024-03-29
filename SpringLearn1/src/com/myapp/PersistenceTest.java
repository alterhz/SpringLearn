package com.myapp;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

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
	
	@Autowired(required=false)
	private DataSource dataSource;

	@Test
	public void testDataSource() {
		assertNotNull(dataSource);
	}
	
}
