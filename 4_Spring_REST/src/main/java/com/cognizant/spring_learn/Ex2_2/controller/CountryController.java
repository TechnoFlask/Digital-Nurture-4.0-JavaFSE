package com.cognizant.spring_learn.Ex2_2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Ex2_2.Country;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CountryController {
     @Autowired
     private Country c;

     private Logger logger = LoggerFactory.getLogger(CountryController.class);

     @RequestMapping("/country")
     public Country getCountryIndia() {
          logger.info("running /country");
          logger.info(c.toString());
          return c;
     }
}
