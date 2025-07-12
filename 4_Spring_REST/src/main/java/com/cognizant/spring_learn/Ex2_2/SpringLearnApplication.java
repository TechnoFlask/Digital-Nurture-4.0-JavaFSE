package com.cognizant.spring_learn.Ex2_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:countries.xml")
public class SpringLearnApplication {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
		logger.info("SpringLearnApplication is being executed");

		SpringApplication.run(SpringLearnApplication.class, args);
	}
}
