package com.gur.user.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@EnableEurekaClient
@RestController
@SpringBootApplication
public class UserAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAddressApplication.class, args);
	}
	@GetMapping("/address/{name}")
	public String getAddress(@PathVariable String name) {
		return "Mr/Ms/Mrs "+name+" residence in address(db)";
	}

}
