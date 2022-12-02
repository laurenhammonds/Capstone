package com.teksystems.capstone1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.teksystems.capstone1.Capstone1Application;


@SpringBootApplication
public class Capstone1Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Capstone1Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Capstone1Application.class, args);
	}
}
