package com.it.fleetapp.services;

import com.it.fleetapp.models.VehiculeHire;
import com.it.fleetapp.repository.VehiculeHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeHireService {

    @Autowired
    private VehiculeHireRepository vehiculeHireRepository;

    public List<VehiculeHire> getVehiculeVehiculeHires() {
        return vehiculeHireRepository.findAll();
    }

    public void saveVehiculeHire(VehiculeHire vehiculeHire) {
        vehiculeHireRepository.save(vehiculeHire);
    }

    public Optional<VehiculeHire> findVehiculeHireById(int id) {
        return vehiculeHireRepository.findById(id);
    }

    public void deleteVehiculeHire(Integer id) {
        vehiculeHireRepository.deleteById(id);
    }


}
