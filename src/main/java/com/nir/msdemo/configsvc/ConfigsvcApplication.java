package com.att.msdemo.configsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController

public class ConfigsvcApplication {
	
	

	@RequestMapping("/")
	public String home() {
		return "Hello Configuration Server";
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigsvcApplication.class, args);
	}
}
