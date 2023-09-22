package space.jbp.sqCh08Ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/home")
	public String home(Model page, 
			@RequestParam(required = false) String color, 
			@RequestParam(required = false) String username) {
		page.addAttribute("username", username);
		color = (color == null ? "brown" : color);  
		page.addAttribute("color", color);
		return "home.html";
	}
}
