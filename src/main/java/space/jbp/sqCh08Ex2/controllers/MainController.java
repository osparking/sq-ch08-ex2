package space.jbp.sqCh08Ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/home")
	public String home(Model page, @RequestParam String color) {
		page.addAttribute("username", "jbpark03");
		page.addAttribute("color", color);
		return "home.html";
	}
}
