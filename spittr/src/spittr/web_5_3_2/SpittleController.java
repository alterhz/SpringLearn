package spittr.web_5_3_2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spittr.Spittle;
import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	
	private SpittleRepository spittleRepository;
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}
	
	private static final String MAX_LONG_AS_STRING = Long.toString(Long.MAX_VALUE);
	// 方法1
	@RequestMapping(method = RequestMethod.GET)
	public List<Spittle> spittles(
			@RequestParam(value = "max", 
				defaultValue = "55555555") long max,
			@RequestParam(value = "count", 
				defaultValue = "20") int count) {
		return spittleRepository.findSpittles(max, count);
	}
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String showSpittle(
			@RequestParam("spittle_id") long spittleId, 
			Model model) {
		model.addAttribute(spittleRepository.findOne(spittleId));
		
		return "spittle";
	}
	
	@RequestMapping(value="/{spittleId}", method = RequestMethod.GET)
	public String spittle(
			@PathVariable long spittleId,
			Model model) {
		model.addAttribute(spittleRepository.findOne(spittleId));
		
		return "spittle";
	}
	
//	@RequestMapping(value="/{spittleId}", method = RequestMethod.GET)
//	public String spittle(
//			@PathVariable("spittleId") long spittleId,
//			Model model) {
//		model.addAttribute(spittleRepository.findOne(spittleId));
//		
//		return "spittle";
//	}

}
