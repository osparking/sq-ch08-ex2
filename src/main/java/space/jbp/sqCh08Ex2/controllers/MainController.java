package space.jbp.sqCh08Ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/home")
	public String home(Model page) {
		page.addAttribute("username", "jbpark03");
		page.addAttribute("color", "deeppink");
		return "home.html";
	}
}
