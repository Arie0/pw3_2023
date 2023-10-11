package com.example.pw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan(basePackages = {
// 	"com.example.pw3.controllers",
// 	"com.example.pw3.models",
// 	"com.example.pw3.repositories",
// 	"com.example.pw3.security",
// 	"com.example.pw3.services",

// })
public class Pw3Application {

	public static void main(String[] args) {
		SpringApplication.run(Pw3Application.class, args);
	}

}
