package com.ajinternatinal.AjINational;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AjINationalApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(AjINationalApplication.class, args);
	}

}
