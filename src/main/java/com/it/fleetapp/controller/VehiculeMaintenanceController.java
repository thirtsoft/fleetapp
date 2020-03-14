package com.it.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeMaintenanceController {
    @GetMapping("/vehiculeMaintenances")
    public String getVehiculeMaintenances() {
        return  "vehiculeMaintenance";
    }
}
