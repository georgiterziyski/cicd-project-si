package com.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdProjectSiApplication {

	@GetMapping("/")
	public String home() {
		return "Georgi's basic endpoint!";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdProjectSiApplication.class, args);
	}

}
