package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {
  @Autowired private CountryService countryService;

  @GetMapping
  public List<Country> getAllCountries() {
    return countryService.getAllCountries();
  }

  @GetMapping("/{code}")
  public Optional<Country> getCountryByCode(@PathVariable String code) {
    return countryService.getCountryByCode(code);
  }

  @PostMapping
  public Country addCountry(@RequestBody Country country) {
    return countryService.addCountry(country);
  }

  @DeleteMapping("/{code}")
  public void deleteCountry(@PathVariable String code) {
    countryService.deleteCountry(code);
  }
}
