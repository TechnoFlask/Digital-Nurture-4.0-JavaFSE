package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {
  private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
  private static CountryService countryService;

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
    countryService = context.getBean(CountryService.class);
    LOGGER.info("Inside main");
    countryService = context.getBean(CountryService.class);
    testGetAllCountries();
    testFindCountryByCode();
    testAddCountry();
    testUpdateCountry();
    testDeleteCountry();
  }

  private static void testFindCountryByCode() {
    try {
      Country country = countryService.findCountryByCode("FR");
      LOGGER.debug("Country: {}", country);
    } catch (CountryNotFoundException e) {
      LOGGER.error("Exception: {}", e.getMessage());
    }
  }

  private static void testGetAllCountries() {
    LOGGER.info("Start");
    List<Country> countries = countryService.getAllCountries();
    LOGGER.debug("countries={}", countries);
    LOGGER.info("End");
  }

  private static void testAddCountry() {
    LOGGER.info("Start");

    Country newCountry = new Country();
    newCountry.setCode("ZZ");
    newCountry.setName("Zootopia");

    countryService.addCountry(newCountry);

    try {
      Country fetchedCountry = countryService.findCountryByCode("ZZ");
      LOGGER.debug("Added Country: {}", fetchedCountry);
    } catch (CountryNotFoundException e) {
      LOGGER.error("Country not found after adding: {}", e.getMessage());
    }

    LOGGER.info("End");
  }

  private static void testUpdateCountry() {
    LOGGER.info("Start");

    try {
      countryService.updateCountry("ZZ", "New Zootopia");
      Country updatedCountry = countryService.findCountryByCode("ZZ");
      LOGGER.debug("Updated Country: {}", updatedCountry);
    } catch (CountryNotFoundException e) {
      LOGGER.error("Exception: {}", e.getMessage());
    }

    LOGGER.info("End");
  }

  private static void testDeleteCountry() {
    LOGGER.info("Start");

    try {
      countryService.deleteCountry("ZZ");
      countryService.findCountryByCode("ZZ");
    } catch (CountryNotFoundException e) {
      LOGGER.debug("Confirmed deletion: {}", e.getMessage());
    }

    LOGGER.info("End");
  }
}
