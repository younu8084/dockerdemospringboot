package com.edureka.devops_demo_june;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsDemoJuneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoJuneApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		return "<h1>Hello There!!! Welcome to my application</h1>";
	}

}
