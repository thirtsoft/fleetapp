package com.it.fleetapp.repository;

import com.it.fleetapp.models.VehiculeHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeHireRepository extends JpaRepository<VehiculeHire, Integer> {
}
