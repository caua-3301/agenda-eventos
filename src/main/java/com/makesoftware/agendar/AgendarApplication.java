package com.makesoftware.agendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = "model")
public class AgendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendarApplication.class, args);
	}

}
