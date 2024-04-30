package theodo.panier.presentation.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/test")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
