package com.it.fleetapp.services;

import com.it.fleetapp.models.VehiculeMouvement;
import com.it.fleetapp.repository.VehiculeMouvementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeMouvementService {

    @Autowired
    private VehiculeMouvementRepository vehiculeMouvementRepository;;

    public List<VehiculeMouvement> getVehiculeMouvements() {
        return vehiculeMouvementRepository.findAll();
    }

    public void saveCVehiculeMouvement(VehiculeMouvement vehiculeMouvement) {
        vehiculeMouvementRepository.save(vehiculeMouvement);
    }

    public Optional<VehiculeMouvement> findVehiculeMouvementById(int id) {
        return vehiculeMouvementRepository.findById(id);
    }

    public void deleteVehiculeMouvement(Integer id) {
        vehiculeMouvementRepository.deleteById(id);
    }

}
