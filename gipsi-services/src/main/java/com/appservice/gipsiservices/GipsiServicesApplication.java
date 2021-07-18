package com.appservice.gipsiservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class GipsiServicesApplication extends SpringBootServletInitializer{
public class GipsiServicesApplication extends SpringBootServletInitializer{

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(GipsiServicesApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(GipsiServicesApplication.class, args);
	}

}
