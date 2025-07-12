package com.cognizant.spring_learn.Ex2_1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
     Logger logger = LoggerFactory.getLogger(HelloController.class);

     @GetMapping("/hello")
     public String sayHello() {
          logger.info("Running /hello");
          String s = "Hello world!!";
          logger.info("Ending /hello");

          return s;
     }
}
