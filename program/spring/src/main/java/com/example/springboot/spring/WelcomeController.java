package com.example.springboot.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController


public class WelcomeController {
	
	/*@GetMapping("/welcome")
	public  String welcome() {
		return "Welcome to the Spring project";
		
	}
	
	@GetMapping(value = "/callclientwelcome")
	private String getWelcomeClient() {
		
		String uri = "http://localhost:8030/welcome";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
		
	}*/
	
	@GetMapping(value = "/posts")
	public List<Object> getPosts(){		
		String url = "https://jsonplaceholder.typicode.com/posts";
		RestTemplate restTemplate = new RestTemplate();
		Object[] posts = restTemplate.getForObject(url, Object[].class);
		
		return Arrays.asList(posts);
		
	}
	
	

}
