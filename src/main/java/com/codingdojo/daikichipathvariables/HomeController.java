package com.codingdojo.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/daikichi/travel/{location}")
	public String location(@PathVariable("location") String location) {
		return "Congratulations, you will soon travel to " + location;
	}

	
	@RequestMapping("/daikichi/lotto/{number}")
	public String number (@PathVariable("number") int number) {
		if (number %2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
	}

}