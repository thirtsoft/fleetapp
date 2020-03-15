package com.it.fleetapp.services;

import com.it.fleetapp.models.Vehicule;
import com.it.fleetapp.models.VehiculeStatus;
import com.it.fleetapp.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeService {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    public List<Vehicule> getVehicules() {
        return vehiculeRepository.findAll();
    }

}
