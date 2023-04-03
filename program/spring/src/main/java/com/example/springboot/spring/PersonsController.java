package com.example.springboot.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonsController {
	
	@GetMapping("/persons")
	public List<Person> getPersons(){
		List<Person> personList = Arrays.asList(new Person(1,"Hema","Rajan"),
				new Person(2,"Hemalatha","Thangarajan")
				);
		
		
		return personList;
	}
}
