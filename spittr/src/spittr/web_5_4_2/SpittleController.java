package spittr.web_5_4_2;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.Spitter;
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
	public String showRegistrationForm() {
		return "registerForm";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String processRegistration(
			@Valid Spitter spitter,
			Errors errors) {
		
		if (errors.hasErrors()) {
			return "registerForm";
		}
		
		spittleRepository.save(spitter);
		return "redirect:/spitter/" + spitter.getUsername();
	}
	
	@RequestMapping(value="/{username}", method = RequestMethod.GET)
	public String showSpitterProfileString(
			@PathVariable String username, Model model) {
		Spitter spitter = spittleRepository.findByUsername(username);
		model.addAttribute(spitter);
		return "profile";
	}

}
