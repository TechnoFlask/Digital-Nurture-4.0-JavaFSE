package com.cognizant.spring_learn.Ex2_3.controller;

import com.cognizant.spring_learn.Ex2_3.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Ex2_3.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CountryController {

     private final Logger logger = LoggerFactory.getLogger(CountryController.class);

     @Autowired
     private final CountryService countryService = null;

     @GetMapping("/countries/{code}")
     public Country getCountry(@PathVariable String code) {
          logger.info("Executing /countries/" + code);
          return countryService.getCountry(code);
     }

}
