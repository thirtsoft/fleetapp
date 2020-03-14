package com.it.fleetapp.repository;

import com.it.fleetapp.models.VehiculeMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeMakeRepository extends JpaRepository<VehiculeMake, Integer> {
}
