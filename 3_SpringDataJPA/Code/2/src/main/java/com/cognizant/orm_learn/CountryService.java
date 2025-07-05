package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

  @Autowired private CountryRepository countryRepository;

  public List<Country> getAllCountries() {
    return countryRepository.findAll();
  }

  public Country getCountryByCode(String code) {
    return countryRepository.findById(code).orElse(null);
  }

  public void addCountry(Country country) {
    countryRepository.save(country);
  }

  public void updateCountry(String code, String newName) {
    Optional<Country> countryOpt = countryRepository.findById(code);
    if (countryOpt.isPresent()) {
      Country country = countryOpt.get();
      country.setName(newName);
      countryRepository.save(country);
    }
  }

  public void deleteCountry(String code) {
    countryRepository.deleteById(code);
  }
}
