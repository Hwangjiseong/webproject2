package kr.ac.dit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleContorller2 {
	@RequestMapping("urlB")
	public String urlBGet() {
		return "view";
	}
	@RequestMapping("urlC")
	public String urlCGet(@ModelAttribute("msg") String msg) {
		return "view";
	}
}
