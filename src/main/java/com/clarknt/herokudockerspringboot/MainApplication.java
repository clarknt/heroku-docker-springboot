package com.clarknt.herokudockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MainApplication {

	@GetMapping("/")
    String getRoot() {
      return "Hello from Spring Boot within Docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
