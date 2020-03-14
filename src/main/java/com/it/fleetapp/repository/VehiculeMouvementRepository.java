package com.it.fleetapp.repository;

import com.it.fleetapp.models.VehiculeMouvement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeMouvementRepository extends JpaRepository<VehiculeMouvement, Integer> {
}
