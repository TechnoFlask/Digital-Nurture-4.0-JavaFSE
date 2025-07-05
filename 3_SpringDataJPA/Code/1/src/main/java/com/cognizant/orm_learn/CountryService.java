package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryService {
  @Autowired private CountryRepository countryRepository;

  @Transactional
  public List<Country> getAllCountries() {
    return countryRepository.findAll();
  }

  @Transactional
  public Country findCountryByCode(String code) throws CountryNotFoundException {
    Optional<Country> result = countryRepository.findById(code);
    if (!result.isPresent())
      throw new CountryNotFoundException("Country with code " + code + " not found");
    return result.get();
  }

  @Transactional
  public void addCountry(Country country) {
    countryRepository.save(country);
  }

  @Transactional
  public void updateCountry(String code, String newName) throws CountryNotFoundException {
    Optional<Country> result = countryRepository.findById(code);

    if (!result.isPresent())
      throw new CountryNotFoundException("Country with code " + code + " not found");

    Country country = result.get();
    country.setName(newName);

    countryRepository.save(country);
  }

  @Transactional
  public void deleteCountry(String code) throws CountryNotFoundException {
    Optional<Country> result = countryRepository.findById(code);

    if (!result.isPresent())
      throw new CountryNotFoundException("Country with code " + code + " not found");

    countryRepository.delete(result.get());
  }
}
