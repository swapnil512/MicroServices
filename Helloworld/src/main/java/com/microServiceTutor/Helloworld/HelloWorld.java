package com.microServiceTutor.Helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorld {

	@RequestMapping("/helloworldMS")
	//http://localhost:port/
	String hello() {
		
		return "This is first micro Service based hello world program.";
	}
	
	@GetMapping()
	String getPosts() {
		
		return "This is first micro Service based hello world program.";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorld.class, args);
	}
}