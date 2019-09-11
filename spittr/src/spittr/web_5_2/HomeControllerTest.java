package spittr.web_5_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception {
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}
}
