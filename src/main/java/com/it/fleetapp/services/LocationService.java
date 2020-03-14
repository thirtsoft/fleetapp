package com.it.fleetapp.services;

import com.it.fleetapp.models.Location;
import com.it.fleetapp.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    public void saveLocation(Location location) {
        locationRepository.save(location);
    }

    public Optional<Location> findLocationById(int id) {
        return locationRepository.findById(id);
    }

    public void deleteLocation(Integer id) {
        locationRepository.deleteById(id);
    }

}
