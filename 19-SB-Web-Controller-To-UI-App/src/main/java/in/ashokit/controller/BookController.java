package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/bookdata")
	public String getBookData(Model model) {

		// setting data to model obj
		model.addAttribute("name", "Spring Boot");
		model.addAttribute("author", "Rod Johnson");
		model.addAttribute("price", 450.00);

		return "book-data";// returning logical view name
	}
}
