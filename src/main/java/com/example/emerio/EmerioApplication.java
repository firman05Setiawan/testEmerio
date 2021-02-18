package com.example.emerio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EmerioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmerioApplication.class, args);
	}

}
