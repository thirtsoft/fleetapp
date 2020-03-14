package com.it.fleetapp.services;

import com.it.fleetapp.models.VehiculeStatus;
import com.it.fleetapp.repository.VehiculeStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeStatusService {

    @Autowired
    private VehiculeStatusRepository vehiculeStatusRepository;

    public List<VehiculeStatus> getVehiculeStatus() {
        return vehiculeStatusRepository.findAll();
    }

    public void saveVehiculeStatus(VehiculeStatus vehiculeStatus) {
        vehiculeStatusRepository.save(vehiculeStatus);
    }

    public Optional<VehiculeStatus> findVehiculeStatusById(int id) {
        return vehiculeStatusRepository.findById(id);
    }

    public void deleteVehiculeStatus(Integer id) {
        vehiculeStatusRepository.deleteById(id);
    }
}
