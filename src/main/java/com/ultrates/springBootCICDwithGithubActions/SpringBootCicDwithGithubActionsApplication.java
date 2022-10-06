package com.ultrates.springBootCICDwithGithubActions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringBootCicDwithGithubActionsApplication {


	@GetMapping("/welcome")
	public String welcome(){
		return "Wel come to Spring boot with Github Actions cicd workflow";
	}


	public static void main(String[] args) {

		SpringApplication.run(SpringBootCicDwithGithubActionsApplication.class, args);
	}

}
