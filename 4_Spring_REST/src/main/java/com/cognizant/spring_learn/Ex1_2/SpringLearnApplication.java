package com.cognizant.spring_learn.Ex1_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
		logger.info("SpringLearnApplication is being executed");

		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"countries.xml")) {
			Country c = context.getBean("country", Country.class);
			logger.info(c.toString());
		}
	}
}
