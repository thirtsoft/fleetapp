package com.it.fleetapp.services;

import com.it.fleetapp.models.VehiculeMaintenance;
import com.it.fleetapp.repository.VehiculeMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeMaintenanceService {

    @Autowired
    private VehiculeMaintenanceRepository vehiculeMaintenanceRepository;;

    public List<VehiculeMaintenance> getVehiculeMaintenances() {
        return vehiculeMaintenanceRepository.findAll();
    }

    public void saveVehiculeMaintenance(VehiculeMaintenance vehiculeMaintenance) {
        vehiculeMaintenanceRepository.save(vehiculeMaintenance);
    }

    public Optional<VehiculeMaintenance> findVehiculeMaintenanceById(int id) {
        return vehiculeMaintenanceRepository.findById(id);
    }

    public void deleteVehiculeMaintenance(Integer id) {
        vehiculeMaintenanceRepository.deleteById(id);
    }

}
