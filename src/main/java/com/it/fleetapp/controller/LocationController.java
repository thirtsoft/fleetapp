package com.it.fleetapp.controller;

import com.it.fleetapp.models.Country;
import com.it.fleetapp.models.Location;
import com.it.fleetapp.models.State;
import com.it.fleetapp.services.CountryService;
import com.it.fleetapp.services.LocationService;
import com.it.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {

    @Autowired
    private LocationService locationservice;

   @Autowired
   private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping("/locations")
    public String getlocations(Model model) {
        List<Location> locationList = locationservice.getLocations();
        model.addAttribute("locations", locationList);

        List<State> stateListList = stateService.getStates();
        model.addAttribute("states", stateListList);

        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries", countryList);

        return "location";
    }

    @PostMapping("/locations/addNew")
    public String addNewLocation(Location location) {
        locationservice.saveLocation(location);
        return "redirect:/locations";
    }

    @RequestMapping("locations/findById")
    @ResponseBody
    public Optional<Location> findById(Integer id) {
        return locationservice.findLocationById(id);
    }

    @RequestMapping(value="locations/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Location Location) {
        locationservice.saveLocation(Location);
        return "redirect:/locations";
    }

    @RequestMapping(value="locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        locationservice.deleteLocation(id);
        return "redirect:/locations";
    }

}
