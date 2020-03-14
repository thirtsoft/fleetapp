package com.it.fleetapp.services;

import com.it.fleetapp.models.VehiculeMake;
import com.it.fleetapp.repository.VehiculeMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeMakeService {

    @Autowired
    private VehiculeMakeRepository vehiculeMakeRepository;
    public List<VehiculeMake> getVehiculeMakes() {
        return vehiculeMakeRepository.findAll();
    }

    public void saveVehiculeMake(VehiculeMake vehiculeMake) {
        vehiculeMakeRepository.save(vehiculeMake);
    }

    public Optional<VehiculeMake> findVehiculeMakeById(int id) {
        return vehiculeMakeRepository.findById(id);
    }

    public void deleteVehiculeMake(Integer id) {
        vehiculeMakeRepository.deleteById(id);
    }
}
