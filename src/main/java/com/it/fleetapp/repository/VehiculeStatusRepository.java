package com.it.fleetapp.repository;

import com.it.fleetapp.models.VehiculeStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeStatusRepository extends JpaRepository<VehiculeStatus, Integer> {
}
