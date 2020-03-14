package com.it.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeController {
    @GetMapping("/vehicules")
    public String getVehicules() {
        return  "vehicule";
    }
}
