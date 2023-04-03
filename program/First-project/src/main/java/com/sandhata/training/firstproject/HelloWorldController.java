package com.sandhata.training.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

	 @GetMapping("/message")
	    public String test() {
	        return "My First App";
	    }

}
