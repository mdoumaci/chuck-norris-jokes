package ma.ac.insea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.norris.chuck.*;;
@Controller
public class JokesController {

	@GetMapping("/")
	public String home(Model model) {
		ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
		String joke = chuckNorrisQuotes.getRandomQuote();
		model.addAttribute("joke", joke);
		return "home-page";
	}
}
