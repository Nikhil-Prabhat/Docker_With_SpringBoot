package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerMavenApplication {
	
	@GetMapping("msg")
	public String getMsg()
	{
		return "Dockerisation with Maven !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerMavenApplication.class, args);
	}

}
