package com.it.fleetapp.repository;

import com.it.fleetapp.models.VehiculeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeTypeRepository extends JpaRepository<VehiculeType, Integer> {
}
