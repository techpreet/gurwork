package com.gur.docker.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class DockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}
	
	@GetMapping("/")
	public String sayHi() {
		return "Hi From Gurpreet";
	}
	
	@GetMapping("/{name}")
	public String sayHiName( @PathVariable String name) {
		return "Hi From "+name;
	}
}
