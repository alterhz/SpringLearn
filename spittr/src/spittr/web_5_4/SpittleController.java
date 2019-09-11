package spittr.web_5_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spitter")
public class SpittleController {
	
	private SpittleRepository spittleRepository;
	
	public SpittleController() {
		
	}
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showregistrationForm() {
		return "registerForm";
	}
	

}
