package com.it.fleetapp.services;

import com.it.fleetapp.models.VehiculeModel;
import com.it.fleetapp.repository.VehiculeModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeModelService {

    @Autowired
    private VehiculeModelRepository vehiculeModelRepository;

    public List<VehiculeModel> getVehiculeModels() {
        return vehiculeModelRepository.findAll();
    }

    public void saveVehiculeModel(VehiculeModel vehiculeModel) {
        vehiculeModelRepository.save(vehiculeModel);
    }

    public Optional<VehiculeModel> findVehiculeModelById(int id) {
        return vehiculeModelRepository.findById(id);
    }

    public void deleteVehiculeModel(Integer id) {
        vehiculeModelRepository.deleteById(id);
    }
}
