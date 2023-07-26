package com.example.restsearchapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RestSearchApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSearchApiApplication.class, args);
	}

}
