package spittr.web_5_2_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	
	private SpittleRepository spittleRepository;
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String spittles(Model model) {
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		//model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		
		return "spittles";
	}
	
	// 方法2
//	@RequestMapping(method = RequestMethod.GET)
//	public String spittles2(Model model) {
//		model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//		
//		return "spittles";
//	}
	
	// 方法3
//	@RequestMapping(method = RequestMethod.GET)
//	public String spittles3(Map model) {
//		model.put("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//		
//		return "spittles";
//	}
	
	// 方法4
//	@RequestMapping(method = RequestMethod.GET)
//	public List<Spittle> spittles4(Model model) {
//		return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
//	}
}
