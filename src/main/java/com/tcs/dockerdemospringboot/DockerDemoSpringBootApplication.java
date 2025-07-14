package com.tcs.dockerdemospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class dockerdemospringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(dockerdemospringbootApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		return "<h1>Hello There!!! Welcome to my spring boot application</h1>";
	}

}
