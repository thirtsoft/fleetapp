package com.it.fleetapp.controller;

import com.it.fleetapp.models.Country;
import com.it.fleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getCountries(Model model) {

        List <Country> countryList = countryService.getCountries();

        model.addAttribute("countries", countryList);

        return  "country";
    }

    @PostMapping("/countries/addNew")
    public String addNewCountry(Country country) {
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping("countries/findById")
    @ResponseBody
    public Optional<Country> findById(Integer id) {
        return countryService.findCountryById(id);
    }

    @RequestMapping(value="countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Country country) {
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value="countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        countryService.deleteCountry(id);
        return "redirect:/countries";
    }
}
