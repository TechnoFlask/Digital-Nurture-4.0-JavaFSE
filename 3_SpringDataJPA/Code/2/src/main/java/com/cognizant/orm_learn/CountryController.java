package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import java.util.List;
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
  public Country getCountry(@PathVariable String code) {
    return countryService.getCountryByCode(code);
  }

  @PostMapping
  public Country addCountry(@RequestBody Country country) {
    countryService.addCountry(country);
    return country;
  }

  @PutMapping("/{code}")
  public Country updateCountry(@PathVariable String code, @RequestBody Country updatedCountry) {
    countryService.updateCountry(code, updatedCountry.getName());
    return countryService.getCountryByCode(code);
  }

  @DeleteMapping("/{code}")
  public Country deleteCountry(@PathVariable String code) {
    Country deletedCountry = countryService.getCountryByCode(code);
    countryService.deleteCountry(code);
    return deletedCountry;
  }
}
