package com.tka.SpringMvcRegisterApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class SpringMvcRegisterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcRegisterAppApplication.class, args);
	}

}
