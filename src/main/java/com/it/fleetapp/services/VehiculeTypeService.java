package com.it.fleetapp.services;

import com.it.fleetapp.models.VehiculeType;
import com.it.fleetapp.repository.VehiculeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeTypeService {

    @Autowired
    private VehiculeTypeRepository vehiculeTypeRepository;

    public List<VehiculeType> getVehiculeTypes() {
        return vehiculeTypeRepository.findAll();
    }

    public void saveVehiculeType(VehiculeType vehiculeType) {
        vehiculeTypeRepository.save(vehiculeType);
    }

    public Optional<VehiculeType> findVehiculeTypeById(int id) {
        return vehiculeTypeRepository.findById(id);
    }

    public void deleteVehiculeType(Integer id) {
        vehiculeTypeRepository.deleteById(id);
    }
}
