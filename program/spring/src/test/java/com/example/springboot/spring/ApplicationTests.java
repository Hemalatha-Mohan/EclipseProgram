package com.example.springboot.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	private WelcomeController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
		System.out.println("controller is not null");
		
	}

}
