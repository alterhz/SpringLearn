package spittr.web_5_2_3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
//@RequestMapping({"/", "/homepage"})
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String home() {
		return "home";
	}
}
