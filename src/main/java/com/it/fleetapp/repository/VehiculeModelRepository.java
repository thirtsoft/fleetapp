package com.it.fleetapp.repository;

import com.it.fleetapp.models.VehiculeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeModelRepository extends JpaRepository<VehiculeModel, Integer> {
}
