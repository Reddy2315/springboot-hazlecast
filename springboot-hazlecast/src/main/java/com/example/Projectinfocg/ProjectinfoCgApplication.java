package com.example.Projectinfocg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProjectinfoCgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectinfoCgApplication.class, args);
	}

}
