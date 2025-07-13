package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.repository.CountryRepository;
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

  public Optional<Country> getCountryByCode(String code) {
    return countryRepository.findById(code);
  }

  public Country addCountry(Country country) {
    return countryRepository.save(country);
  }

  public void deleteCountry(String code) {
    countryRepository.deleteById(code);
  }
}
