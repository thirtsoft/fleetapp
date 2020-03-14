package com.it.fleetapp.services;

import com.it.fleetapp.models.Country;
import com.it.fleetapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public void saveCountry(Country country) {
        countryRepository.save(country);
    }

    public Optional<Country> findCountryById(int id) {
        return countryRepository.findById(id);
    }

    public void deleteCountry(Integer id) {
        countryRepository.deleteById(id);
    }
}
